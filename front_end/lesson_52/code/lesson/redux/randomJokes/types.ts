interface JokeData {
  id: string,
  question: string,
  answer: string
}

export interface RandomJokesSliceState {
  data: JokeData[],
  status: 'default' | 'loading' | 'success' | 'error',
  error: any
}