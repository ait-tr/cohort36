// import { useEffect } from 'react';
import { useAppSelector } from '../../app/hooks';
// import { getProducts } from './reduxProductsAction';

function ReduxProducts() {
  // достаем данные и store из деструктуризации
  // мы имеем доступ к этим данным в любом месте приложения
  const {products, isLoading, error} = useAppSelector(store => store.reduxProducts)
  // готовимся отправить данные через dispatch

  return (
    <div>
      <h3>Redux products</h3>
      <p>В компоненте у нас будет два главных инструмента для работы с redux</p>
      <ul>
        <li>useAppDispatch() - функция внутри которой мы вызываем action и отправляем запрос</li>
        <li>useAppSelector() - функция в которой мы забирем измененные данные из store в любом компоненте в приложении</li>
      </ul>
      <h3>Our products from redux:</h3>
      {isLoading && <h4>Loading...</h4>}
      {products && products.map(el => (
        <p>{el.title}</p>
      ))}
      {error && <p style={{color: 'red'}}>{error}</p>}
    </div>
  );
}

export default ReduxProducts;
