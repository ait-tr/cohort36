import React, { useState } from "react";
import style from "./Counter.module.css";

export default function Counter(): JSX.Element {
  const [counter, setCounter] = useState<number>(0);
  // создали переменную состояния counter
  // и функцию setCounter для изменения состояни
  // useState - это хук
  //в круглых скобках начальное состояние переменной состояния
  // хук useState принимает начальное  значение  переменной состояния
  // возвращает массив в котором на первом месте переменная состояния
  // а навтором функция сетер
  // Хук это функция которая используется только внутри компонента
  // В жизненном цикле компонента React есть 3 фазы
  // 1 фаза это сборка (mouting)
  // 2 фаза это (updating)
  // 3 фаза это разборка (unmounting)
  function handlePlus(): void {
    setCounter(counter + 1);
  }
  function handleMinus(): void {
    setCounter(counter - 1);
  }

  return (
    <>
      <h1>Добавление денег</h1>
      <img
        src="https://www.zastavki.com/pictures/originals/2020Finance_Wallpapers___Money_Lot_of_euro_bills_close_up_145693_.jpg"
        alt=""
      />
      <div className={style.container}>
        <button type="button" className={style.btn} onClick={handleMinus}>Убрать лишние деньги</button>
        <span style={{color:"red"}}>${counter} euro</span>
        <button type="button" className={style.btn} onClick={handlePlus}>Добавить деньги на счет</button>
      </div>
    </>
  );
}
