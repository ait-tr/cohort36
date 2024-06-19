import React, { useState } from 'react';

import BrotherCard from '../../components/brotherCard/BrotherCard';
import { brotherhood } from './data';
import './style.css';

export default function Lesson06() {
  const [brothers, setBrothers] = useState(brotherhood);
  console.log(brothers);
  return (
    <div className="container-brotherhood">
      <h1>6. React: map() components</h1>
      {brothers.map(brother => (
        <BrotherCard setBrothers={setBrothers} key={brother.id} brotherProp={brother} />
      ))}
    </div>
  );
}
