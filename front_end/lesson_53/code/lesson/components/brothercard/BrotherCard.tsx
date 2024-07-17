import { Dispatch, SetStateAction } from 'react';
import { v4 } from 'uuid';
import { IBrother } from '../../homeworks/homework_08/type';

import styles from './brothercard.module.css';

interface IBrotherProps {
  brotherProp: IBrother;
  setBrothers: Dispatch<SetStateAction<IBrother[]>>;
}


export default function brotherPropCard({ brotherProp, setBrothers }: IBrotherProps) {

  // const delBrother = (id: number) => {
  //   setBrothers(prev => prev.filter(brother => brother.id !== id));
  // };

  return (
    <div className={styles.brotherCardContainer}>
      <h2>{brotherProp.name}</h2>
      <p>race: {brotherProp.race}</p>
      <p>brother id: {brotherProp.id}</p>
      <ol>
        {brotherProp.skills.map(skill => (
          <li key={v4()}>{skill}</li>
        ))}
      </ol>
      <img src={brotherProp.image} alt="" />
      {/* <ButtonStyledComponent/> */}
      <button style={{ marginTop: '10px' }}>Delete brother</button>
    </div>
  );
}
