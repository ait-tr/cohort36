import { useEffect, useState } from 'react';

import styles from './lesson10.module.css';

interface IProduct {
  id: number;
  title: string;
  price: number;
  category: string;
  description: string;
  image: string;
}

const Lesson10 = () => {
  const [toggle, setToggle] = useState<boolean>(false);
  const [products, setProducts] = useState<IProduct[]>([]);
  const [count, setCount] = useState<number>(10);

  async function getProducts() {
    const res = await fetch('https://fakestoreapi.com/products');
    const data = await res.json();
    setProducts(data);
    console.log('getProducts только вначале и при counter !');
  }

  const changeToggle = () => {
    setToggle((prev) => !prev);
  };

  // useEffect - это хук функция из react, позволяющая изолировать код от ненужного повторного перевыполнения при перезагрузке компонента

  // * мы прячем это ререндр
  useEffect(() => {
    getProducts();
  }, []);
  // *

  console.log('rerender!');

  // принимает в себя стрелочную функцию с логикой и массив зависимостей - условие перевыполнения

  return (
    <div>
      <header className={styles.header}>
        <h3>Lesson {count}</h3>
        <div>
          <a href="/">Home</a>
          <a href="/">Info</a>
          <a href="/">Profile</a>
          <span onClick={changeToggle}>≡</span>
        </div>
      </header>

      {/* если toggle true - мы покажем элемент на странице - если false спрячем */}

      {toggle && (
        <div className={styles.counter}>
          <p>{count}</p>
          <div>
            <button onClick={() => setCount(count - 1)}>minus!</button>
            <button onClick={() => setCount(count + 1)}>plus!</button>
          </div>
        </div>
      )}

      <ul>
        {products.map((el) => (
          <li key={el.id}>{el.title}</li>
        ))}
      </ul>

    </div>
  );
};

export default Lesson10;
