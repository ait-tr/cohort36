import React from "react";
import style from "./CityPage.module.css";

function CityPage(): JSX.Element {
  return (
    <div className={style.cityClass}>
        <div>
        <h1>Все о городе</h1>
      <p>
        Lorem, ipsum dolor sit amet consectetur adipisicing elit. Nam ipsum
        adipisci quia a dolores molestiae in reiciendis sapiente sit dolorum.
        Ratione harum omnis nobis voluptates repellat quae nemo aut? Laboriosam
        voluptate adipisci minima inventore nam saepe sunt aliquid fugiat
        suscipit nemo debitis tempore nesciunt quaerat, at exercitationem
        explicabo, perferendis rerum?
      </p>
        </div>
      <img src="https://mykaleidoscope.ru/x/uploads/posts/2022-09/1663395505_44-mykaleidoscope-ru-p-germaniya-stolitsa-berlin-dostoprimechatel-48.jpg" alt="" />
    </div>
  );
}
export default CityPage;
