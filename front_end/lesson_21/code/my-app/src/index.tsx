import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import CityPage from './components/CityPage/CityPage';
import Counter from './components/Counter/Counter';
import Sandwich from './components/Sandwich/Sandwich';
import Playground from './components/Playground/Playground';
import CarShop from './components/CarShop/CarShop';
import Activity from './components/Activity/Activity';
import FlowerShop from './components/FlowerShop/FlowerShop';




const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <FlowerShop />
    <Activity />
    <CarShop />
    <Playground />
    <Sandwich />
    <Counter />
    <CityPage />
    <App />
  </React.StrictMode>
);


