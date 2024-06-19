import { v4 } from 'uuid';

export default function brotherPropCard({ brotherProp, setBrothers }) {


  /// мы сравниваем id в стейте brothers с массивом объектов в родительском компоненте
  // с id конкретной карточки, которую получаем из props
  const delBrother = (id) => {
    setBrothers(prev => prev.filter(brother => brother.id !== id))
  }

  return (
    <div>
      <h2>{brotherProp.name}</h2>
      <p>race: {brotherProp.race}</p>
      <p>brother id: {brotherProp.id}</p>
      <ol>
        {brotherProp.skills.map(skill => (
          <li key={v4()}>{skill}</li>
        ))}
      </ol>
      <img src={brotherProp.image} alt="" />
      <button onClick={() => delBrother(brotherProp.id)} style={{marginTop: '10px'}}>Delete brother</button>
    </div>
  );
}
