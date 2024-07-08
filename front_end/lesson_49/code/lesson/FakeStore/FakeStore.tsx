import { useEffect, useState } from "react";
import { Link } from 'react-router-dom';
import Button from '../button/Button';
import style from "./fakeStore.module.css";

export interface Iproduct {
  id: number;
  title: string;
  price: number;
  description: string;
  category: string;
  image: string;
  rating: {
    rate: number;
    count: number;
  };
}

const FakeStore = () => {
  const [products, setProducts] = useState<Iproduct[]>([]);
  async function getData() {
    const res = await fetch("https://fakestoreapi.com/products");
    const data = await res.json();
    setProducts(data);
  }
  useEffect(() => {
    getData();
  }, [products]);

  return (
    <>
      <h3>Shop</h3>
      <div className={style.container}>
        {products.map((product) => (
          <div key={product.id} className={style.card}>
            <h2>{product.title}</h2>
            <span>{product.price}$</span>
            {/* <p>{product.description}</p>
            <span>{product.category}</span> */}
            <img src={product.image} alt={product.title} />
            {/* добавляем id товара к адресу */}
            <div className={style.buttonWrapper}>
              <Link to={String(product.id)}><Button name='к продукту'></Button></Link>
            </div>
          </div>
        ))}
      </div>
    </>
  );
};
export default FakeStore;
