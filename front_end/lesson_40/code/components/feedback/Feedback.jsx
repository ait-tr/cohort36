import React, { useState } from 'react';

export default function Feedback() {
  console.log('render!');

  const [like, setLike] = useState(0);
  const [dislike, setDislike] = useState(0);


  const addLike = () => {
    setLike(prev => prev + 1);
    setLike(prev => prev + 1);
  };

  const addDisLike = () => {
    setDislike(prev => prev + 1);
  };

  const resetLikes = () => {
    setLike(0);
    setDislike(0);
  };

  return (
    <div>
      <div>
        <button onClick={addLike}>Like</button>
        <span>{like}</span>
      </div>
      <div>
        <button onClick={addDisLike}>Dislike</button>
        <span>{dislike}</span>
      </div>
      <div>
        <button onClick={resetLikes}>Reset Results</button>
        <span></span>
      </div>
    </div>
  );
}
