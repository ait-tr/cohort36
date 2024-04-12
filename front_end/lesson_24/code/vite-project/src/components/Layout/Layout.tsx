
import { Outlet } from 'react-router-dom'
import NavBar from '../NavBar/NavBar';


export default function Layout():JSX.Element {
  return (
    <> 
    <NavBar />
    <Outlet /> 
    <footer>
        Тут будет подвал
    </footer>
    </>
  );
}
