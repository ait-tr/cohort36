import Button from "components/Button/Button";
import { JokeCard, RandomJokesWrapper, JokeText } from "./styles";
import { useAppDispatch, useAppSelector } from "store/hooks";
import { randomJokesSliceActions, randomJokesSliceSelectors } from "store/redux/randomJokes/randomJokesSlice";
import Spinner from "components/Spinner/Spinner";

function RandomJokes() {
  const dispatch = useAppDispatch();
  const { data, status, error } = useAppSelector(randomJokesSliceSelectors.jokeData)

  const jokes = data.map((joke) => {
    return <JokeText key={joke.id}>{joke.question}: {joke.answer}</JokeText>
  })

  const getJoke = () => {
    dispatch(randomJokesSliceActions.getJoke())
  }

  return (
    <RandomJokesWrapper>
      <JokeCard>
        {status === 'loading' && <Spinner />}
        <Button name='Get Joke' onClick={getJoke} />
        {jokes}
      </JokeCard>
    </RandomJokesWrapper>
  )
}

export default RandomJokes