import React from 'react'

const Menu = ({items})=>{
  // функциональный компонент Menu,
  // который принимает объект items в качестве параметра.
  //  items будет массивом объектов, представляющих элементы меню.
return(
<div className='section-center'>
    {items.map((menuItem)=>{
        const {id,title,price,img,desc}= menuItem;
        return(
            <article key={id} className='menu-item'>
                {/* Элемент article с уникальным ключом id для оптимизации рендеринга.
            Каждый элемент в React-списке должен иметь уникальный ключ,
            чтобы React мог эффективно управлять обновлениями */}
            <img src={img} alt={title} className='photo' />
            <div className='item-info'>
            <header>
                <h4>{title}</h4>
                <h4 className='price'>${price}</h4>
            </header>
            <p className='item-text'>{desc}</p>
            </div>
            </article>

        )
    })}

</div>
)

}


export default Menu