import { ChangeEvent } from 'react';
import styles from './input.module.css';

interface IInputProps {
  name?: string,
  placeholder?: string,
  type?: string,
  label?: string,
  value?: string,
  onChange?: (event: ChangeEvent<HTMLInputElement>) => void,
  error?: string;
}

function Input({ name, placeholder, type = "text", label, value, onChange, error }: IInputProps) {
  return (
    <div className={styles.inputContainer}>
      {label && <label className={styles.label}>{label}</label>}
      <input
        className={styles.input}
        name={name}
        placeholder={placeholder}
        type={type}
        value={value}
        onChange={onChange} />
      {error && <div className={styles.error}>{error}</div>}
    </div>
  );
}

export default Input;
