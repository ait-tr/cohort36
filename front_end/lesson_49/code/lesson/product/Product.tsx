import { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Iproduct } from '../FakeStore/FakeStore';

import Button from '../button/Button';
import styles from './product.module.css';

const Product = () => {

  const initialValue: Iproduct = {
    id: 0,
    title: '',
    price: 0,
    description: '',
    category: '',
    image: '',
    rating: {
      rate: 0,
      count: 0
    }
  };
  const [product, setProduct] = useState<Iproduct>(initialValue);
  const { id } = useParams();

  useEffect(() => {
    fetch(`https://fakestoreapi.com/products/${id}`)
      .then(res => res.json())
      .then(data => setProduct(data));
  }, [id]);

  return (
    <div className={styles.productContainer}>
      {product.title && (
        <>
          <h1>{product.title}</h1>
          <p>{product.description}</p>
          <img width={300} src={product.image} alt="" />
          <Link to={'/shop-page'}><Button name='назад' /></Link>
        </>
      )}
    </div>

  );
};

export default Product;
