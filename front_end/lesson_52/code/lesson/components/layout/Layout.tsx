import { Outlet } from 'react-router-dom';
import styles from './layout.module.css';
import Header from '../header/Header';
import { useEffect } from 'react';
import { useAppDispatch } from '../../app/hooks';
import { getProducts } from '../../features/reduxProducts/reduxProductsAction';

export default function Layout() {
  const dispatch = useAppDispatch()

  useEffect(()=> {
    // в диспатч передаем вызов функции из файла с actions
    dispatch(getProducts())
  }, [dispatch])


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

