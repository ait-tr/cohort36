import type Product from './types/Product'

export default interface ProductsState {
	products: Product[]
	error?: string
}
