import { createSlice } from '@reduxjs/toolkit';
import { IUserData } from '../../components/auth/Auth';
import { getUserWithToken, loginUser } from './authAction';

// типизируем объект, который мы положим в store
// в нем будут данные с сервера + переключатель лоадера и сообщение из ошибки
interface IUserState {
  user: IUserData
  isLoading: boolean
  error: string
}

// создаем начальное значение для данных пользователя
// этот шаблон заменится на реальные данные после успешного запроса
// нужен чтобы ts не ругался
const initialUser: IUserData = {
  id: 0,
  username: '',
  gender: '',
  email: '',
  image: '',
  firstName: '',
  lastName: '',
  refreshToken: '',
  token: ''
}

// создаем объект-начальное значение
const initialState: IUserState = {
  user: initialUser,
  isLoading: false,
  error: '',
};

export const authSlice = createSlice({
  name: 'authSlice',
  initialState,
  // используется для синхронных операций со store в redux
  reducers: {
    // придумываем ключ-имя для action
    // по ключу стрелочная функция с описанием операции над данными в state
    logoutUser: (state) => {
      state.user = initialUser
    }
  },
  extraReducers: (builder) => {
    builder
      .addCase(loginUser.pending, (state) => {
        state.isLoading = true;
      })
      .addCase(loginUser.fulfilled, (state, action) => {
        state.isLoading = false
        state.user = action.payload;
      })
      .addCase(loginUser.rejected, (state, action) => {
        state.isLoading = false
        state.user = initialUser
        state.error = action.payload as string
      })
      // в случае вызова getUserWithToken() к нам приходят данные о юзере
      // мы записываем их  в тот же стейт
      .addCase(getUserWithToken.fulfilled, (state, action) => {
        state.isLoading = false
        state.user = action.payload;
      })
      .addCase(getUserWithToken.pending, (state) => {
        state.isLoading = true;
      })

  },
});

export default authSlice;

// экспорт синхронных actions из нашего slice
export const { logoutUser } = authSlice.actions
