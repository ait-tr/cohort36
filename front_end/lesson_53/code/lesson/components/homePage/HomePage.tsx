import { useAppSelector } from '../../app/hooks';
import Loader from '../loader/Loader';


export default function HomePage() {
  const { user, isLoading } = useAppSelector(store => store.user);

  return (
    <div>
      {!isLoading && !user.firstName && <h2>Пройдите авторизацию 🔐</h2>}
      {isLoading && <Loader />}
      {user.firstName && <h2>Welcome home 🏡</h2>}
    </div>
  );
}

