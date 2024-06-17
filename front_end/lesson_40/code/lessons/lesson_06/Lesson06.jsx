import React from 'react';

import { brotherhood } from './data';
import './style.css';
import BrotherCard from '../../components/brotherCard/BrotherCard';

export default function Lesson06() {
  return (
    <div className="container-brotherhood">
      <h1>Lesson 06</h1>
      {brotherhood.map(brother => (
        <BrotherCard key={brother.id} brotherProp={brother} />
      ))}
    </div>
  );
}
