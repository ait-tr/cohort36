import { createAsyncThunk, createSlice } from '@reduxjs/toolkit'
import type ProductsState from './ProductsState'
import * as api from './api'
const initialState: ProductsState = {
	products: [],
}
// Как писать фичу
// папка -> types -> типы для одной сущности и
// для централизрованного состояния
// -> пишем api -> создаем файл slice -> initital state -> async thunk ->
// -> сам slice -> добавляем в store

// Async thunk - это функция, которая создает action creator для
// асинхронных операций в Redux Toolkit. Thunk - это функция,
// которая оборачивает вызов функции, позволяя выполнять
// дополнительную логику перед ее вызовом.
// В контексте Redux Toolkit async thunk позволяет вам создавать
// action creators, которые могут асинхронно отправлять действия (actions),
// вызывать API запросы

// Async thunks используются для выполнения асинхронных действий,
// таких как запросы к API. Они позволяют вам отправлять несколько
// последовательных действий (например, запрос, успех и ошибку)
// на основе результата асинхронной операции.

export const loadProducts = createAsyncThunk(
	'products/loadProducts', // type нашего action
	() => api.getAll() // payload - в данном случае Product[]
	// - то что возвращает api с раскрытым промисом
)

export const deleteProduct = createAsyncThunk(
	'products/deleteProduct', // type нашего action
	(id: number) => api.deleteProduct(id) // // payload - в данном случае Product
)

export const productsSlice = createSlice({
	name: 'products',
	initialState,
	reducers: {}, // not async code
	extraReducers: builder => {
		builder
			.addCase(loadProducts.fulfilled, (state, action) => {
				state.products = action.payload
			})
			.addCase(deleteProduct.fulfilled, (state, action) => {
				state.products = state.products.filter(product => product.id !== action.payload.id)
			})
	},
})
export default productsSlice.reducer
