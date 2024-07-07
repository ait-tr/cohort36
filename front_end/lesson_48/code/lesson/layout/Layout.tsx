import { Link, Outlet, useLocation } from 'react-router-dom';
import styles from './layout.module.css'

export default function Layout() {

  const location = useLocation()
  console.log('где это я?', location.pathname);

  return (
    <div className={styles.page}>
      <header className={styles.header}>
        {/* специальный тег Link из RRT для навигации */}
        <Link className={location.pathname === '/' ? styles.active : ''} to={'/'}>home</Link>
        {/* в аттрибуте to мы прописываем путь до компонента */}
        {/* путь в to должен соответствовать path в теге <Route> в схеме маршрутизации */}
        <Link className={location.pathname === '/login-form' ? styles.active : ''}  to={'/login-form'}>login form</Link>
        <Link className={location.pathname === '/brotherhood' ? styles.active : ''} to={'/brotherhood'}>brotherhood</Link>
        <Link className={location.pathname === '/brotherhood' ? styles.active : ''} to={'/employee-form'}>employee form</Link>
    
      </header>
      <main className={styles.main}>
        {/*  вместо этого тега Outlet будут приходить компоненты из routes */}
        <Outlet/>
      </main>
      <footer className={styles.footer}></footer>
    </div>
  );
}

