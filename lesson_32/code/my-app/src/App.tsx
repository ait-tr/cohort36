import './App.css'
import { Counter } from './features/counter/Counter'
import ProductsList from './features/products/ProductsList'
import { Quotes } from './features/quotes/Quotes'

function App(): JSX.Element {
	return (
		<div className="App">
			<ProductsList />
			<Counter />
			<Quotes />
		</div>
	)
}

export default App
