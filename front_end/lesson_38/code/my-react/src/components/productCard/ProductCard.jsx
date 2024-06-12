import './productCard.css';

function ProductCard() {
  const productData = {
    image:
      'https://c02.purpledshub.com/uploads/sites/39/2019/02/IMG_20190421_160951-38d256a.jpg?w=1240&webp=1',
    title: 'Bike bag',
    desc: 'Pannier bags and luggage racks are a classic approach to carrying kit on your bike, offering stability and volume for cycle touring.',
    isAvailable: false
  };

  return (
    <div
      className={
        productData.isAvailable ? 'product-card' : 'product-card disable'
      }
    >
      <h4>{productData.title}</h4>
      <img src={productData.image} alt="" />
      <p>{productData.desc}</p>
    </div>
  );
}

export default ProductCard;
