// eslint-disable-next-line import/no-extraneous-dependencies
import { Outlet } from 'react-router-dom'
import Navbar from '../components/Navbar/Navbar'
export default function Layout(): JSX.Element {
	return (
		<>
			<header>Хедер</header>
			<Navbar />
			<Outlet />
			<footer> i am footer</footer>
		</>
	)
}
