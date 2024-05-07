// eslint-disable-next-line import/no-extraneous-dependencies
import { Route, Routes } from 'react-router-dom'
import './App.css'
import { Counter } from './features/counter/Counter'
import ProductsList from './features/products/ProductsList'
import { Quotes } from './features/quotes/Quotes'
import Layout from './layouts/Layout'
import Home from './components/Home/Home'
import Login from './features/auth/Login'
import ProtectedRoute from './components/ProtectedRoute/ProtectedRoute'
import PostsList from './features/posts/PostsList'

function App(): JSX.Element {
	return (
		<>
			<Routes>
				<Route path="/" element={<Layout />}>
					<Route index element={<Home />} />
					<Route path="counter" element={<Counter />} />
					<Route path="products" element={<ProductsList />} />
					<Route path="quotes" element={<Quotes />} />
					<Route path="posts" element={<ProtectedRoute outlet={<PostsList />} />} />
					<Route path="login" element={<Login />} />
				</Route>
			</Routes>
		</>
	)
}

export default App
