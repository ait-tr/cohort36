import Button from '../button/Button';
import Input from '../input/Input';
import styles from './loginform.module.css'

function LoginForm() {
  return (
    <div className={styles.form}>
      <Input type={'email'} placeholder={'Type your email'} label={'Email'} />
      <Input type={'password'} placeholder={'Type your password'} label={'Password'} />
      <Button />
    </div>
  );
}

export default LoginForm;
