import { useParams } from 'react-router-dom';

export default function TestParams() {
  const { name, lastname } = useParams();
  return (
    <div>
      <h1>{name} </h1>
      <p>{lastname}</p>


    </div>
  );
}
