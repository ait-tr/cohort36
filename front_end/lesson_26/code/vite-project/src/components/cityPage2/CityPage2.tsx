import { FC, useState } from "react";
import MyButton from "../myButtom/MyButton";


const CityPage2: FC = ()=>{

    const Berlin = {
        name:'Berlin',
        title:'Capital of Germany',
        imgUrl:'https://content.r9cdn.net/rimg/dimg/94/77/3c308be3-lm-1035-172eedc4c70.jpg?width=1366&height=768&xhint=2600&yhint=3239&crop=true'
    };
    const Paris ={
        name:'Paris',
        title:'Capital of France',
        imgUrl:'https://imageio.forbes.com/specials-images/imageserve/6468ea7be5b5bee9d12e9948/eiffel-tour-and-Paris-cityscape/0x0.jpg?format=jpg&height=1835&width=2767'

    }
    // переключатель булевого значения
    const [isBerlin, setIsBerlin]= useState(true);
    const [cityData, setCityData]= useState(Berlin);

    // переключатель булевого значения
    const toggleCity = ():void=>{
// setIsberlin берет предыдущее значение isBerlin как параметр на вход
//  (потому что это функци)- и возвращает его , но как противоположное
//   и кладет в isBerlin это противоположное значение
        setIsBerlin((isBerlin)=>{
            if(!isBerlin){
                setCityData(Berlin);
            } else{
                setCityData(Paris)
            }
            return !isBerlin
        });
    }
return(
    <div className="App">
        <h1>{cityData?.name}</h1>
        <p>{cityData?.title}</p>
        <div className="imgWrapper">
            <img className="berlinImg" src={cityData?.imgUrl} alt="" />
        </div>
        <MyButton onClick={toggleCity} text={isBerlin ? 'switch to Paris':'back to Berlin'} />
    </div>
);
};
export default CityPage2