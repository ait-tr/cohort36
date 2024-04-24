
import './App.css'
import Counter from './features/counter/Counter'
import Sandwich from './features/sandwich/Sandwich'
import Tasks from './features/tasks/Tasks'
import TaskCreation from './features/tasks/TaskCreation'


function App():JSX.Element {
  return (
    <div>
      <Tasks />
      <TaskCreation />
      <Sandwich />
      <Counter />
    </div>
  );
}

export default App
