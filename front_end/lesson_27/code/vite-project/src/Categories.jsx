import React from 'react';

const Categories = ({categories, filterItems})=>{
return(
    <div className='btn-container'>
        {categories.map((category, index)=>{
            //{categories.map((category, index) => {
        // Эта строка начинает маппинг массива categories.
        // Функция map применяется к каждому элементу в массиве categories.
        //  Переменная category представляет отдельный элемент массива,
        // а index - его индекс.
            return(
                <button
                    type="button"
                    className='filter-btn'
                    key={index}
                    onClick={()=>filterItems(category)}
                //Этот атрибут определяет функцию, которая будет вызвана при клике на кнопку.
            // В данном случае, она вызывает функцию filterItems и передает ей category в
            // качестве аргумента.
            //{category}: Это значение, которое будет отображаться на кнопке.
            // Оно берется из текущего элемента массива categories.
                >
                {category}
                </button>
            );
        })}

    </div>
)
}

export default Categories;