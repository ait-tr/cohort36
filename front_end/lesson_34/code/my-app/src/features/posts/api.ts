import Post from './types/Post'

export async function getAll(): Promise<{ posts: Post[] }> {
	const res = await fetch('https://dummyjson.com/posts')
	return res.json()
}

export async function getPostsByWord(word: string): Promise<{ posts: Post[] }> {
	const res = await fetch(`https://dummyjson.com/posts/search?q=${word}`)
	return res.json()
}

export async function editPostTitle(title: string, id: number): Promise<Post> {
	const res = await fetch(`https://dummyjson.com/posts/${id}`, {
		method: 'PUT' /* or PATCH */,
		headers: { 'Content-Type': 'application/json' },
		body: JSON.stringify({
			title,
		}),
	})
	return res.json()
}

// getAll(): Эта функция извлекает все посты с фиктивной конечной точки API.
// getPostsByWord(word: string): Эта функция извлекает посты, содержащие определенное слово в их
// содержании или заголовке. Она отправляет запрос на поиск к конечной точке API.
// editPostTitle(title: string, id: number): Эта функция обновляет заголовок поста с заданным ID
// Она отправляет запрос PUT или PATCH к конечной точке API с обновленным заголовком в теле запроса
