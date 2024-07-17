import { FormEvent } from 'react';
import styles from './button.module.css';

//добавили interface props
// которые просил добавить ts для безопасности

interface IButtonProps {
  isGetButton?: boolean;
  name?: string;
  onClick?: () => void | ((event: number) => void);
  disabled?: boolean;
  type?: 'button' | 'submit' | 'reset';
  onSubmit?: (e: FormEvent<HTMLButtonElement>) => void;
}

function Button({
  name = 'undefined', isGetButton = false, onClick, onSubmit, type = 'button', disabled = false }: IButtonProps) {


  return (
    <button
      type={type}
      onSubmit={onSubmit}
      onClick={onClick}
      className={`${styles.button} ${isGetButton ? styles.buttonDanger : styles.buttonPrimary}`}
      disabled={disabled}
    >
      {name}
    </button>
  );
}

export default Button;

