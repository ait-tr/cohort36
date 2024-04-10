import React from 'react';
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

function App():JSX.Element {
  return (
  <Routes>
    <Route path="/" element={<Layout />}>
    <Route path="/activity" element={<Activity />} />
    <Route path="/counter" element={<Counter />} />
    <Route path="/cityPage" element={<CityPage />} />
    <Route path="/sandwich" element={<Sandwich />} />
    <Route path="/coctail" element={<Cocktail />} />
    <Route path="/users" element={<UsersPage />} />
    <Route path="/users/:userId" element={<UserPage />} />
    <Route path="/products" element={<Products />} />
    <Route path="/products/:productId" element={<ProductPage />} />
    </Route>
  </Routes>
  );
}

export default App;
