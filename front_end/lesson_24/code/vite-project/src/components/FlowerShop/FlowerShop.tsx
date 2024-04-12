import React from "react";
import Flower from "../Flower/Flower";

export default function FlowerShop() {
  return (
    <div>
      <h1>FlowerShop</h1>
      <Flower title="red tulip" color="red" price={2} family="tulip" />
      <Flower title="rose white" color="green" price={2} family="rose" />
      <Flower title="iris blue" color="blue" price={3} family="iris" />
      <Flower title="Lily" color="yellowgreen" price={4} family="Liliaceae" />
    </div>
  );
}
