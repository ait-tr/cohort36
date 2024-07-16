import { createAppSlice } from "store/createAppSlice";
import { UsersSliceState, UserData } from "./types";
import { PayloadAction } from "@reduxjs/toolkit";

const usersInitialState: UsersSliceState = {
  users: []
}

export const usersSlice = createAppSlice({
  name: 'USERS',
  initialState: usersInitialState,
  reducers: create => ({
    addUser: create.reducer((state: UsersSliceState, action: PayloadAction<UserData>) => { state.users = [...state.users, action.payload] }),
    deleteAllUsers: create.reducer(() => usersInitialState),
    deleteUser: create.reducer((state: UsersSliceState, action: PayloadAction<string>) => {
      state.users = state.users.filter((user) => {
        return user.id !== action.payload
      })
    })
  }),
  selectors: {
    users: (state: UsersSliceState) => state.users
  }
})

export const usersSliceActions = usersSlice.actions
export const userSliceSelectors = usersSlice.selectors
