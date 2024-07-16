import { Action, configureStore, ThunkAction } from "@reduxjs/toolkit";
import reduxProductsSlice from '../features/reduxProducts/reduxProductsSlice';

// это банк-хранилище всех наших данных 🏦
export const store = configureStore({
  reducer: {
    // добавляем данные в store из reduxProductsSlice
    // через обращение к его ключу reducer
    reduxProducts: reduxProductsSlice.reducer
    // user: userSlice.reducer
  },
});

export type AppDispatch = typeof store.dispatch;
export type RootState = ReturnType<typeof store.getState>;
export type AppThunk<ReturnType = void> = ThunkAction<
  ReturnType,
  RootState,
  unknown,
  Action<string>
>;
