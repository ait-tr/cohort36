import React, {useState } from "react";

import style from "./RandomDog.module.css";

export default function RandomDog(): JSX.Element {
  
  const [ URL, setURL ] = useState<string>("");
  async function loadDogPicture(): Promise<void> {
    const res = await fetch("https://dog.ceo/api/breeds/image/random");
    const obj = await res.json();
    console.log(obj);
    const { message } = obj;
    setURL(message);
  }
//   useEffect(()=> {
//     loadDogPicture();
//   },[]);
  return (
    <div className={style.container}>
      <h1 className={style.heading}>Random dog</h1>
      <div className={style.imageContainer}>
        <img className={style.image} src={URL} alt="" />
        <button className={style.btn} onClick={()=>loadDogPicture()} type="button">
          Next image
        </button>
      </div>
    </div>
  );
}
