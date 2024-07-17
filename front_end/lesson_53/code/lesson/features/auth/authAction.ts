import { createAsyncThunk } from '@reduxjs/toolkit';
import axios, { AxiosResponse } from 'axios';
import { IFormValues, IUserData } from '../../components/auth/Auth';

export const loginUser = createAsyncThunk(
  'authAction',
  // в параметр дата придут данные из формы, когда мы вызовем loginUser
  async (data: IFormValues, thunkAPI) => {
    try {
      // мы типизируем response внутренним типом библиотеки axios и дженериком добавляем тип данных, которые придут в ответе
      const response: AxiosResponse<IUserData> = await axios.post('https://dummyjson.com/user/login', data);
      // записываем токен для последующего автоматического входа в аккаунт
      // во внутреннее хранилище браузера local storage
      // его данные доступны во вкладке application в браузере
      localStorage.setItem("shop-token", response.data.token);
      return response.data;
    } catch (error: any) {
      return thunkAPI.rejectWithValue(error.message);
    }
  }
);


export const getUserWithToken = createAsyncThunk(
  'loginToken',
  async (token: string, thunkAPI) => {
    try {
      const response: AxiosResponse<IUserData> = await axios.get('https://dummyjson.com/user/me', {
        headers: {
          'Authorization': `Bearer ${token}`
        }
      });
      return response.data;
    } catch (error: any) {
      return thunkAPI.rejectWithValue(error.message);
    }
  }
);

