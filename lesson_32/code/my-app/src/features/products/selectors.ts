import { RootState } from '../../app/store'
import type Product from './types/Product'

// eslint-disable-next-line @typescript-eslint/no-unsafe-member-access
export const selectProducts = (state: RootState): Product[] => state.products.products
export const selectError = (state: RootState): string | undefined => state.products.error
