import { uid } from 'uid';
import Dish from './types/Dish';
import Action from './types/Action';

const initialState: Dish[] = [
  {
    id: uid(),
    title: 'salad',
    category: 'snack',
    price: 9,
    image: 'https://c.pxhere.com/photos/25/95/salad_food_dish_plate_meal_healthy_cuisine_fresh-1289471.jpg!s2',
  }
];

export default function dishesReducer(
  state: Dish[] = initialState,
  action: Action
): Dish[] {
  switch (action.type) {
    case 'dishes/create':
      return [...state, { ...action.payload, id: uid() }];
    case 'dishes/delete':
      return state.filter((dish) => dish.id !== action.payload);
    case 'dishes/edit':
      return state.map((dish) =>
        dish.id === action.payload.id ? action.payload : dish
      // state.map((dish) => ...): Эта часть перебирает каждое блюдо в массиве состояния.
      // dish.id === action.payload.id ? action.payload : dish: Для каждого блюда проверяется,
      // совпадает ли его id с id блюда в переданных действием данных (action.payload). Если совпадает,
       // возвращается обновленное блюдо из данных действия; в противном случае возвращается текущее блюдо.
      );
    default:
      return state;
  }
}
