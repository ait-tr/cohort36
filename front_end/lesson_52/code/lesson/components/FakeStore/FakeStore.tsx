import { useEffect, useState } from "react";
import ProductCard from '../productCard/ProductCard';
import style from "./fakeStore.module.css";
import { Iproduct } from '../../features/reduxProducts/types';



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
      {
        products.length > 0 && (
          <>
            <h3>Shop</h3>
            <div className={style.container}>
              {products.map((product) => (
                <ProductCard
                  key={product.id}
                  image={product.image}
                  title={product.title}
                  id={product.id}
                />
              ))}
            </div>
          </>
        )
      }
    </>
  );
};
export default FakeStore;
