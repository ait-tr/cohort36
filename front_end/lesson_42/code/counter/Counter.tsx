import React from 'react';
import { useState } from 'react';
import './counter.css'
export default function Counter() {
  const [count, setCount] = useState<number>(0);

  const countPlus = () => {
    // функция setCount перезаписывает переменную count изменение state ведет к rerender компонента, но значение в переменной сохраняется
    setCount(prev => prev + 1);
  };
  return (
    <div className='counter'>
      <h5>Counter with useState() hook:</h5>
      <p>{count}</p>
      <button onClick={countPlus}>Plus!</button>
    </div>
  );
}
