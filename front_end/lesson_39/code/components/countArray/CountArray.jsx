// import { useState } from 'react';
import './style.css';

import { useState } from 'react';

function CountArray() {
  const [arr, setArr] = useState([]);

  console.log(arr);

  const addItem = () => {
    setArr([...arr, 'item']);
  };

  const removeItem = () => {
    setArr(arr.slice(0, -1));
  };

  return (
    <div className="counter-arr">
      <p>Count array</p>
      <button onClick={addItem}>add item!</button>
      <button onClick={removeItem}>remove item...</button>

      <ul>
        {arr.map((el, index) => (
          <li key={index}>{el}</li>
        ))}
      </ul>
    </div>
  );
}

export default CountArray;
