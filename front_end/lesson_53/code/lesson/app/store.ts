import { Action, configureStore, ThunkAction } from "@reduxjs/toolkit";
import authSlice from '../features/auth/authSlice';
import reduxProductsSlice from '../features/reduxProducts/reduxProductsSlice';

export const store = configureStore({
  reducer: {
    reduxProducts: reduxProductsSlice.reducer,
    user: authSlice.reducer
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
