import './button.css';
function Button() {
  const sendButton = 'Send data';
  const getButton = 'Get data';
  // от значения в этой переменной должен меняться цвет
  const isGetButton = false;

  // * запись тернарного оператора:
  // { выражение ? если выражение верное : если выражение ложное }

  return (
    <button
      className={`button ${isGetButton ? 'button-danger' : 'button-primary'}`}
    >
      {isGetButton ? getButton : sendButton}
    </button>
  );
}

export default Button;

// сделайте так, чтобы при значении true isGetButton кнопки были одного цвета, а при значении false другого
