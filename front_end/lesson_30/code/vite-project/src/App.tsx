
import './App.css'
import Counter from './features/counter/Counter'
import Sandwich from './features/sandwich/Sandwich'
import Tasks from './features/tasks/Tasks'
import TaskCreation from './features/tasks/TaskCreation'
import MovieCreation from './features/movies/MovieCreation'
import Movies from './features/movies/Movies'


function App():JSX.Element {
  return (
    <div>
      <MovieCreation />
      <Movies />
      <Tasks />
      <TaskCreation />
      <Sandwich />
      <Counter />
    </div>
  );
}

export default App
