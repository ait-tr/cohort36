import { useEffect } from 'react';
import { Outlet } from 'react-router-dom';
import { useAppDispatch } from '../../app/hooks';
import { getUserWithToken } from '../../features/auth/authAction';
import { getProducts } from '../../features/reduxProducts/reduxProductsAction';
import Header from '../header/Header';
import styles from './layout.module.css';

export default function Layout() {
  const dispatch = useAppDispatch();

  useEffect(() => {
    // забираем token из браузерного хранилища
    const token = localStorage.getItem('shop-token');
    // если токен не null (то есть существует)
    // делаем запрос за данными юзера с этим токеном
    if (token !== null) {
      // отправляем запрос из redux
      dispatch(getUserWithToken(token));
      dispatch(getProducts());
    }
  }, [dispatch]);


  return (
    <div className={styles.page}>
      <Header />
      <main className={styles.main}>
        <Outlet />
      </main>
      <footer className={styles.footer}></footer>
    </div>
  );
}

