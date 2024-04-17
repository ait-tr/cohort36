import MyButton from "../myButtom/MyButton";
import CatImage from "../catImage/CatImage";
import styles from '../catImage/CatImage.module.css'


import { FC, useEffect, useState } from "react";

const CatCard: FC = () => {
    const [text, setText] = useState('');
    const [img, setImg] = useState('');
    
  
    function fetchCat(): void {
      fetch('https://catfact.ninja/fact')
        .then((res) => res.json())
        .then((data) => setText(data.fact));
    }
    function fetchCatImg(): void {
      //function fetchCatImg(): void
      // {: Это определение функции fetchCatImg,
      // которая не принимает аргументов и не возвращает ничего (void).
      fetch('https://cataas.com/cat')
        // .then(res => res.json())
        .then((res) => {
          //.then((res) => {: Это метод then, который вызывается после завершения запроса.
          // Он принимает функцию обратного вызова, которая будет выполнена, когда запрос завершится успешно.
          // res здесь - это объект ответа на запрос.
          setImg(`${res.url}?timestamp=${new Date().getTime()}`);
          // Это вызов функции setImg, который устанавливает изображение в соответствии
          // с URL-адресом из объекта ответа res. Добавляется параметр timestamp,
          // чтобы гарантировать, что каждый раз загружается новое изображение (предотвращение кэширования).
  
        });
      
    }
    useEffect(() => {
      fetchCat();
      fetchCatImg();
    }, []);

    return(
        <div>
            <h1>CatCARD</h1>
            <p>{text}</p>
            <CatImage img={img} />
            <MyButton text ="меняю факт  о кошке" onClick={()=>{fetchCat(); fetchCatImg();}} />
        </div>
    );
};
export default CatCard;
