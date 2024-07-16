export interface UserData {
  id: string
  fullName: string,
  age: string,
  jobTitle: string
}

export interface UsersSliceState {
  users: UserData[]
}