import { FC } from 'react'
import styles from './CatImage.module.css'

interface Img{
    img:string
}

const CatImage: FC<Img>=({img})=>{
    return <img className={styles.catImg} src={img} alt="cat" />;
};

export default CatImage;