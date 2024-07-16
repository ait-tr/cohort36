import { createAppSlice } from "store/createAppSlice";
import { RandomJokesSliceState } from "./types";
import { v4 } from "uuid";

const randomJokesInitialState: RandomJokesSliceState = {
  data: [],
  status: 'default',
  error: undefined
}

export const randomJokesSlice = createAppSlice({
  name: 'RANDOM_JOKES',
  initialState: randomJokesInitialState,
  reducers: create => ({
    //Cоздаем middleware с помощью метода createThunk
    //метод createThunk принимает 2 аргумента
    //1-й аргумент - асинхронная функция
    //2-й аргумент - объект с 3-мя методами, которые обрабатывают результат выполнения асинхронной функции
    getJoke: create.asyncThunk(async (arg, thunkApi) => {
      const response = await fetch('https://official-joke-api.appspot.com/random_joke')
      const result = await response.json()
      console.log(result)

      if (!response.ok) {
        //выполняем переход к мини редьюсеру (к обработчику) rejected
        thunkApi.rejectWithValue(result)
      } else {
        //выполняем переход к мини редьюсеру (к обработчику) fulfilled
        return result
      }
    },
      {
        //обрабатываем событие ожидания ответа от сервера
        pending: (state: RandomJokesSliceState) => {
          console.log('pending')

          state.status = 'loading'
          state.error = undefined
        },
        //обработка данных (успешное завершение)
        //action - данные, которые возвращает middleware
        fulfilled: (state: RandomJokesSliceState, action: any) => {
          console.log('fulfilled')

          state.status = 'success'
          state.data = [...state.data, {
            id: v4(),
            question: action.payload.setup,
            answer: action.payload.punchline
          }]
        },
        //обработка ошибки (запрос завершился с ошибкой)
        rejected: (state: RandomJokesSliceState, action: any) => {
          console.log('rejected')

          state.status = 'error'
          state.error = action.payload
        }
      }
    )
  }),
  selectors: {
    jokeData: (state: RandomJokesSliceState) => state
  }
})

export const randomJokesSliceActions = randomJokesSlice.actions;
export const randomJokesSliceSelectors = randomJokesSlice.selectors