import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import CityPage from './components/CityPage/CityPage';
import Counter from './components/Counter/Counter';
import Sandwich from './components/Sandwich/Sandwich';



const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <Sandwich />
    <Counter />
    <CityPage />
    <App />
  </React.StrictMode>
);


