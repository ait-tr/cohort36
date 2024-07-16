import { createAsyncThunk } from '@reduxjs/toolkit';
import axios from 'axios';

// * этот файл actions нужен для описания асинхронных действий

// createAsyncThunk принимает в себя два параметра
// 1. уникальное имя
// 2. описание асинхронного запроса
export const getProducts = createAsyncThunk(
  'reduxProductsAction',
  async (_, thunkAPI) => {
    try {
      // axios - это библиотека упрощающая работу с fetch запросами
      // например запрос данных вызывается в одну строку
      const response = await axios.get('https://fakestoreapi.com/products');
      return response.data;
    } catch (error: any) {
      return thunkAPI.rejectWithValue(error.message);
    }
  }
);

