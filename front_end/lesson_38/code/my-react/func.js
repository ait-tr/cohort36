functionDeclaration();

function functionDeclaration() {
  console.log('functionDeclaration');
}

const arrowFunction = () => {
  console.log('arrowFunction');
  return 4 + 4;
};

console.log(arrowFunction());

const functionExpression = function () {
  console.log('functionExpression');
};

functionExpression();
