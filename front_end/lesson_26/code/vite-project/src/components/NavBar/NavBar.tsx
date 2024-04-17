
import style from "./NavBar.module.css";
import { NavLink } from "react-router-dom";

export default function NavBar(): JSX.Element {
  return (
    <nav className={style.navigation}>
      <ul className={style.list}>
        <li className={style.listElement}>
          <NavLink to="/coctail" className={style.link}>
            Coctail
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/products" className={style.link}>
            Products
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/counter" className={style.link}>
            Counter
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/cityPage" className={style.link}>
            CityPage
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/sandwich" className={style.link}>
            Sandwich
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/users" className={style.link}>
            Users
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/btnTest" className={style.link}>
           btnTest
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/cityPage2" className={style.link}>
           cityPage2
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/TodoList" className={style.link}>
           TodoList
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/CatCard" className={style.link}>
           CatCard
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/BitcoinPriceComponent" className={style.link}>
          BitcoinPriceComponent
          </NavLink>
        </li>
        <li className={style.listElement}>
          <NavLink to="/Calculator" className={style.link}>
          Calculator
          </NavLink>
        </li>
      </ul>
    </nav>
  );
}
