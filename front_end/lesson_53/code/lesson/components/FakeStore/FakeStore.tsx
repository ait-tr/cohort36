import { useAppSelector } from '../../app/hooks';
import Loader from '../loader/Loader';
import ProductCard from '../productCard/ProductCard';
import style from "./fakeStore.module.css";



const FakeStore = () => {
  const { products, isLoading } = useAppSelector(state => state.reduxProducts);
  return (
    <>
      {isLoading && <Loader />}
      {products.length > 0 && (
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
        </>)}
    </>
  );
};
export default FakeStore;
