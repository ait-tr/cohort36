import { Link, useLocation } from 'react-router-dom';
import { useAppDispatch, useAppSelector } from '../../app/hooks';
import { links } from '../header/links';
import styles from './header.module.css';
import { logoutUser } from '../../features/auth/authSlice';
import { cleanProducts } from '../../features/reduxProducts/reduxProductsSlice';

export default function Header() {
  const dispatch = useAppDispatch()
  const location = useLocation();
  const { user } = useAppSelector(store => store.user);

  const handleLogout = () => {
    localStorage.removeItem('shop-token')
    dispatch(logoutUser())
    dispatch(cleanProducts())
  }

  return (
    <header className={styles.header}>
      {user.username ? (
          <>
          <div className={styles.credentials}>
            <span>user: {user.firstName}</span>
            <span>lastname: {user.lastName}</span>
            <span>email: {user.email}</span>
          </div>

          {links.map((el, index) => (
            <Link key={index} className={location.pathname === el.pathname ? styles.active : ''} to={el.pathname}>{el.title}</Link>
          ))}
          <Link onClick={handleLogout} to='/'>logout</Link>
          </>
      ) : (
        <Link to='/login'>login</Link>
      )}
    </header>
  );
}
