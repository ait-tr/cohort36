
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Layout from './components/Layout/Layout';
import Activity from './components/Activity/Activity';
import Counter from './components/Counter/Counter';
import Cocktail from './components/Cocktail/Cocktail';
import ProductPage from './components/ProductPage/ProductPage';
import Products from './components/Products/Products';
import CityPage from './components/CityPage/CityPage';
import Sandwich from './components/Sandwich/Sandwich';
import UsersPage from './components/UsersPage/UsersPage';
import UserPage from './components/UserPage/UserPage';
import BtnTest from './components/btnTest/BtnTest';
import CityPage2 from './components/cityPage2/CityPage2';
import Todo from './components/TodoList/Todo';
import CatCard from './components/CatCard/CatCard';
import BitcoinPriceComponent from './components/BitcoinPriceComponent/BitcoinPriceComponent';
import Calculator from './components/Calculator/Calculator';

function App():JSX.Element {
  return (
  <Routes>
    <Route path="/" element={<Layout />}>
    <Route path="/activity" element={<Activity />} />
    <Route path="/counter" element={<Counter />} />
    <Route path="/cityPage" element={<CityPage />} />
    <Route path="/sandwich" element={<Sandwich />} />
    <Route path="/coctail" element={<Cocktail />} />
    <Route path="/Calculator" element={<Calculator />} />
    <Route path="/BitcoinPriceComponent" element={<BitcoinPriceComponent />} />
    <Route path="/CatCard" element={<CatCard />} />
    <Route path="/TodoList" element={<Todo />} />
    <Route path="/cityPage2" element={<CityPage2 />} />
    <Route path="/btnTest" element={<BtnTest />} />
    <Route path="/users" element={<UsersPage />} />
    <Route path="/users/:userId" element={<UserPage />} />
    <Route path="/products" element={<Products />} />
    <Route path="/products/:productId" element={<ProductPage />} />
    </Route>
  </Routes>
  );
}

export default App;
