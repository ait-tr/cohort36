import { useContext } from 'react';
import { Link, useLocation } from 'react-router-dom';
import { links } from '../header/links';
import { UserContext } from '../userContext/UserContext';
import styles from './header.module.css';

export default function Header() {
  const location = useLocation();
  const { user } = useContext(UserContext);

  return (
    <header className={styles.header}>
      {user.firstName && (
        <div className={styles.credentials}>
          <span>🤖: №{user.firstName}</span>
          <span>создатель: {user.lastName}</span>
          <span>email: {user.email}</span>
        </div>)}

      {links.map((el, index) => (
        <Link key={index} className={location.pathname === el.pathname ? styles.active : ''} to={el.pathname}>{el.title}</Link>
      ))}
    </header>
  );
}
