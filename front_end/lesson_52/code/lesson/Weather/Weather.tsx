import { ChangeEvent, useState } from "react";

import Input from "components/Input/Input";
import Button from "components/Button/Button";
import {
  WeatherWrapper,
  Header,
  Main,
  WeatherForm,
  WeatherButtonWrapper,
  InputButtonWrapper,
} from "./styles";
import { WeatherInfoData, WeatherErrorData } from './types'
import WeatherInfo from "./components/WeatherInfo/WeatherInfo";
import WeatherError from "./components/WeatherError/WeaherError";

function Weather() {
  const [city, setCity] = useState<string>('')
  const [weatherInfo, setWeatherInfo] = useState<WeatherInfoData | undefined>(undefined)
  const [weatherError, setWeatherError] = useState<WeatherErrorData | undefined>(undefined)

  const APP_ID: string = "eea75aae6dbe00233ac1efadf2d99a2a";
  const URL: string = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${APP_ID}`;

  const onChangeCity = (event: ChangeEvent<HTMLInputElement>) => {
    setCity(event.target.value)
  }

  const getWeatherInfo = async () => {
    if (city.length === 0) {
      alert('Enter city name')
    } else {
      setWeatherInfo(undefined)
      setWeatherError(undefined)


      const response = await fetch(URL)
      const data = await response.json()
      console.log(data)

      if (response.ok) {
        setWeatherInfo({
          temp: `${Math.round(data?.main?.temp - 273.15)} C`,
          icon: `http://openweathermap.org/img/w/${data?.weather[0].icon}.png`,
          cityName: data?.name
        })
      } else {
        setWeatherError({
          code: data?.cod,
          message: data?.message
        })
      }
    }

  }

  return (
    <WeatherWrapper>
      <Header>Weather App</Header>
      <Main>
        <WeatherForm>
          <InputButtonWrapper>
            <Input
              placeholder="Enter city name"
              onChange={onChangeCity}
              value={city}
              name="city"
            />
            <WeatherButtonWrapper>
              <Button name="Search" onClick={getWeatherInfo} />
            </WeatherButtonWrapper>
          </InputButtonWrapper>
          {!!weatherInfo && <WeatherInfo temp={weatherInfo?.temp} icon={weatherInfo?.icon} cityName={weatherInfo?.cityName} />}
          {!!weatherError && <WeatherError error={weatherError} />}
        </WeatherForm>
      </Main>
    </WeatherWrapper>
  );
}

export default Weather;
