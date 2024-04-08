import React from "react";
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
      </ul>
    </nav>
  );
}
