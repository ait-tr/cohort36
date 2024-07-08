import ReactDOM from 'react-dom/client';
import { HashRouter, Route, Routes } from 'react-router-dom';
import EmployeeForm from './components/employeeForm/EmployeeForm';
import FakeStore from './components/FakeStore/FakeStore';
import Layout from './components/layout/Layout';
import LoginForm from './components/loginForm/LoginForm';
import Product from './components/product/Product';
import BrotherHood from './homeworks/homework_08/brotherhood/BrotherHood';
import './index.css';


const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <HashRouter>
    <Routes>
      <Route path='/' element={<Layout />} >
        <Route path='/' element={<h1>homepage</h1>} />
        <Route path='/login-form' element={<LoginForm />} />
        <Route path='/brotherhood' element={<BrotherHood />} />
        <Route path='/employee-form' element={<EmployeeForm />} />
        <Route path='/shop-page' element={<FakeStore />} />
        <Route path='/shop-page/:id' element={<Product />} />
        <Route path='*' element={<h1>Error 404 😵</h1>} />
      </Route>
    </Routes>
  </HashRouter>
);


