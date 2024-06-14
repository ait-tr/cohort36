import './animalCard.css';

function AnimalCard({animalPropsData}) {


  return (
    <div className='animal-card'>
      <h4>{animalPropsData.name}</h4>
      <p>I am {animalPropsData.species}</p>
      <img src={animalPropsData.img} alt="" />
    </div>
  );
}

export default AnimalCard;
