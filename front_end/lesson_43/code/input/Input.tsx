import styles from './input.module.css';


interface IInputProps {
  placeholder: string;
  type: string;
  label: string;
}


function Input({ placeholder, type, label }: IInputProps) {
  return (
    <div className={styles.inputContainer}>
      <label className={styles.label} htmlFor="">{label}: </label>
      <input className={styles.input} type={type} placeholder={placeholder} />
    </div>
  );
}

export default Input;
