import ReactDOM from 'react-dom/client';
import { HashRouter, Route, Routes } from 'react-router-dom';
import EmployeeForm from './components/employeeForm/EmployeeForm';
import Layout from './components/layout/Layout';
import LoginForm from './components/loginForm/LoginForm';
import BrotherHood from './homeworks/homework_08/brotherhood/BrotherHood';
import './index.css';


const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  // обертка HashRouter для всего приложения
  <HashRouter>
    {/* обертка Routes для всех путей */}
    <Routes>
      {/* обертка Route для родительского элемента с версткой Layout, в которой есть неизменная навигация  и изменяемая часть <Outlet>  */}
      <Route path='/' element={<Layout />} >
        {/* компонент который отобразится на начальной странице */}
        <Route path='/' element={<h1>homepage</h1>} />
        {/* пути для всех остальных компонентов, к ним можно обратится через ссылки <Link> */}
        <Route path='/login-form' element={<LoginForm />} />
        <Route path='/brotherhood' element={<BrotherHood />} />
        <Route path='/employee-form' element={<EmployeeForm />} />
        {/* на этот путь придут все остальные запросы */}
        <Route path='*' element={<h1>Error 404 😵</h1>} />
      </Route>
    </Routes>
  </HashRouter>
);


