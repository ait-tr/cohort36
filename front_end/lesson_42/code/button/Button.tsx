import './button.css';

//добавили interface props
// которые просил добавить ts для безопасности

interface IButtonProps {
  isGetButton: boolean;
  // buttonText необязательный пропс, указан через оператор '?'
  buttonText?: string;
  // типизируем props с функцией без return
  onButtonClick?: () => void;
}

function Button({ buttonText = 'push', isGetButton, onButtonClick }: IButtonProps) {
  return (
    <button
      onClick={onButtonClick}
      className={`button ${isGetButton ? 'button-danger' : 'button-primary'}`}
    >
      {buttonText}
    </button>
  );
}

export default Button;

