import { v4 } from 'uuid';

export default function brotherPropCard({ brotherProp }) {
  return (
    <div>
      <h2>{brotherProp.name}</h2>
      <p>race: {brotherProp.race}</p>
      <ol>
        {brotherProp.skills.map(skill => (
          <li key={v4()}>{skill}</li>
        ))}
      </ol>
      <img src={brotherProp.image} alt="" />
    </div>
  );
}
