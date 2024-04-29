
import './App.css'
import Counter from './features/counter/Counter'
import Sandwich from './features/sandwich/Sandwich'
import Tasks from './features/tasks/Tasks'
import TaskCreation from './features/tasks/TaskCreation'
import MovieCreation from './features/movies/MovieCreation'
import Movies from './features/movies/Movies'
import DishForm from './features/dishes/DishForm'
import DishesList from './features/dishes/DishesList'


function App():JSX.Element {
  return (
    <div>
      <MovieCreation />
      <Movies />
      <Tasks />
      <TaskCreation />
      <Sandwich />
      <Counter />
      <DishForm />
      <DishesList />
    </div>
  );
}

export default App
