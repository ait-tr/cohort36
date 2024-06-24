import ButtonStyledComponent, { StyledButton } from '../../components/buttonStyledComponent/ButtonStyledComponent';
import LoginForm from '../../components/loginForm/LoginForm';
import styles from './lesson09.module.css'


export default function Lesson09() {
  return (
    <div className={styles.container}>
      <h1>Lesson 09</h1>
      <p>Styled components & react modules</p>
      <ButtonStyledComponent />
      <StyledButton>Просто кнопка не компонент</StyledButton>
      <LoginForm />
      {/* <Button isGetButton={true} /> */}
      {/* <BrotherHood /> */}
    </div>
  );
}
