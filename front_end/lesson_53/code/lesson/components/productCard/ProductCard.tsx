import { Link } from 'react-router-dom';
import Button from '../button/Button';
import style from './productCard.module.css'


interface IProductCardProps {
  id?: number;
  title?: string;
  price?: number;
  description?: string;
  category?: string;
  image?: string;
}

export default function ProductCard({id, title, image, price} : IProductCardProps) {
  return (
    <div key={id} className={style.card}>
      <h2>{title}</h2>
      <span>{price}$</span>
      <img src={image} alt={title} />
      <div className={style.buttonWrapper}>
        <Link to={String(id)}><Button name='к продукту'></Button></Link>
      </div>
    </div>
  );
}
