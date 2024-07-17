import ReactDOM from 'react-dom/client';
import { Provider } from 'react-redux';
import { HashRouter, Route, Routes } from 'react-router-dom';
import { store } from './app/store';
import FakeStore from './components/FakeStore/FakeStore';
import HomePage from './components/homePage/HomePage';
import Layout from './components/layout/Layout';
import Product from './components/product/Product';
import { UserProvider } from './components/userContext/UserContext';

import './index.css';
import Auth from './components/auth/Auth';


const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  // оборачиваем все приложение в обертку Provider из redux
  // в качестве props передаем store
  <Provider store={store}>
    <UserProvider>
      <HashRouter>
        <Routes>
          <Route path='/' element={<Layout />} >
            <Route path='/' element={<HomePage />} />
            <Route path='/login' element={<Auth />} />
            <Route path='/shop-page' element={<FakeStore />} />
            <Route path='/shop-page/:id' element={<Product />} />
            <Route path='*' element={<h1>Error 404 😵</h1>} />
          </Route>
        </Routes>
      </HashRouter>
    </UserProvider>
  </Provider>
);


