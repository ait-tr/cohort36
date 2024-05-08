import type Product from './types/Product'
// GET - метод для получения данных
export async function getAll(): Promise<Product[]> {
	const res = await fetch('https://fakestoreapi.com/products')
	return res.json()
}
// DELETE - явно указали
export async function deleteProduct(id: number): Promise<Product> {
	const res = await fetch(`https://fakestoreapi.com/products/${id}`, {
		method: 'DELETE',
	})
	return res.json()
}
