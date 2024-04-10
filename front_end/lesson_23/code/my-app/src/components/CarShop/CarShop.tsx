import React from 'react'
import Car from '../Car/Car'

export default function CarShop():JSX.Element {
  return (
    <div>
        <h1> CAR SHOP</h1>
        <h2>Cars</h2>
        {/* вызываем */}
        <Car brand="Mercedes" color="black" />
        <Car brand="Porshe" color="green" />
        <Car brand="BMW" color="red" />
        <Car brand="Toyota" color="yellow" />
    </div>
  )
}
