import { useState } from 'react'
import Menu from './Menu'
import Categories from './Categories'
import items from './data'
const allCategories = ['all', ...new Set(items.map((item)=>item.category))];
// В этой части кода создается массив allCategories,
// который содержит все уникальные категории блюд,
// включая категорию 'all'. Он создается с помощью map,
// чтобы извлечь категории из массива items, и new Set,
// чтобы убедиться, что категории уникальны.

function App() {
  const [menuItems, setMenuItems] = useState(items)
  const [categories, setCategories] = useState(allCategories)
// Внутри компонента App определены стейты menuItems и categories,
  // которые хранят текущие блюда и категории. Компонент App рендерит следующее:

  // Заголовок "our menu".
  // Компонент Categories с передачей ему массива categories и функции filterItems.
  // Этот компонент отображает список категорий блюд и позволяет пользователю выбирать
  // категорию для фильтрации.
  // Компонент Menu с передачей ему отфильтрованных блюд из массива menuItems.

const filterItems = (category)=>{
  if (category=== 'all'){
    setMenuItems(items);
    return;
  }
  const newItems = items.filter((item)=>item.category===category)
  setMenuItems(newItems)
}
//Когда пользователь выбирает категорию в компоненте Categories, вызывается функция filterItems,
  // которая фильтрует блюда по выбранной категории и обновляет стейт menuItems,
  // что в свою очередь приводит к перерисовке компонента Menu с новым списком блюд.
  // Если выбрана категория 'all', отображаются все блюда.


  return (
 <main>
  <section className='menu section'>
    <div className='title'>
      <h2>Our menu</h2>
      <div className='underline'></div>
    </div>
    <Categories categories={categories} filterItems={filterItems} />
    <Menu items={menuItems} />
  </section>
 </main>
  );
}

export default App
