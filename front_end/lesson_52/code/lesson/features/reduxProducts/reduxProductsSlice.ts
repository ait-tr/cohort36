
import { createSlice } from '@reduxjs/toolkit';
import { getProducts } from './reduxProductsAction';
import { Iproduct } from './types';

// в нашем объекте мы сможем обработать три состояния promise данных

// 1. isLoading - ожидание
// 2. products - успех
// 3. error - ошибку


interface IproductSlice {
  products: Iproduct[];
  isLoading: boolean,
  error: string;
}

const initialState: IproductSlice = {
  products: [],
  isLoading: false,
  error: '',
};

// создаем настройки для работы со store
// файл создается с помощью функции creteSlice()
// в качестве параметра вы передаете настройки для вашего store

export const reduxProductsSlice = createSlice({
  // имя, которое должно быть уникальным - строка
  name: 'reduxProducts',
  // начальные значения
  initialState,
  // обработчики синхронных действий
  reducers: {},
  // обработчик асинхронных действий
  extraReducers: (builder) => {
    builder
      // в случае начала загрузки мы включим loader
       //в параметре state мы работаем с данными в state
      .addCase(getProducts.pending, (state) => {
        state.isLoading = true;
      })
      // в случае успеха мы подгрузим данные
      // и выключим loader
      // из параметра action мы забираем данные из результата запроса
      .addCase(getProducts.fulfilled, (state, action) => {
        state.isLoading = false;
        // здесь мы получаем данные пришедшие из getProducts в случае успеха
        state.products = action.payload;
      })
      // здесь мы обрабатываем ошибку
      // выключаем loader
      // обнуляем стейт
      // и показываем ошибку
      .addCase(getProducts.rejected, (state, action) => {
        state.isLoading = false;
        state.products = [];
        state.error = action.payload as string;
      });
  },
});

export default reduxProductsSlice;

// на случай синхронных операций
// export const { } = reduxProductsSlice.actions

