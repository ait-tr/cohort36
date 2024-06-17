import './button.css';
function Button({ buttonText, isGetButton }) {
  return (
    <button
      className={`button ${isGetButton ? 'button-danger' : 'button-primary'}`}
    >
      {buttonText}
    </button>
  );
}

export default Button;

// сделайте так, чтобы при значении true isGetButton кнопки были одного цвета, а при значении false другого
