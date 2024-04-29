import { uid } from "uid";
import Movie from "./types/Movie";
import Action from "./types/Action";


const initialState: Movie[]=[
    {
        id: uid(),
        title: 'Harry Potter',
        genre: 'fantasy',
        country: 'Great Britan',
        releaseDate:'2001-02-03'
    }
];

export default function moviesReducer(
    state: Movie[]= initialState,
    action: Action
): Movie[]{
    switch (action.type){
        case 'movies/add':
            return [...state,{...action.payload, id:uid()}]
    // Возвращается новый массив состояния (state) с добавленным в конец новым объектом фильма.
    // Объект фильма берется из action.payload (предполагается, что в payload содержится информация
    // о новом фильме), а также добавляется новое поле id, которое генерируется функцией uid()
        case 'movies/delete':
            return state.filter((movie)=>movie.id !== action.payload)
    // Возвращается новый массив состояния (state), в котором удалены все элементы,
      // у которых id не соответствует id, указанному в action.payload (
      // payload содержит id удаляемого фильма).
        case 'movies/editTitle':
            return state.map((movie)=>movie.id === action.payload.id ? {...movie, title: action.payload.newTitle}: movie)
            default: return state
            // Если id фильма совпадает с id, указанным в action.payload,
            // то возвращается новый объект фильма с измененным заголовком (title).
            // В противном случае возвращается исходный объект фильма без изменений.
    }
}