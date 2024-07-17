import { useState } from 'react';


import BrotherCard from '../../../components/brothercard/BrotherCard';
import { brotherhood } from '../data';
import { IBrother } from '../type';
import './style.css';

export default function BrotherHood() {
  // типизируем массив из useState() через дженерик
  const [brothers, setBrothers] = useState<IBrother[]>(brotherhood);
  console.log(brothers);
  return (
    <div className="container-brotherhood">
      {brothers.map(brother => (
        <BrotherCard setBrothers={setBrothers} key={brother.id} brotherProp={brother} />
      ))}
    </div>
  );
}

