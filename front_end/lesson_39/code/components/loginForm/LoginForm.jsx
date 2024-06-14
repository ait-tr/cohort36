import FormButton from '../formButton/FormButton';
import Input from '../input/Input';

function LoginForm() {
  return (
    <div>
      <Input type={'email'} placeholder={'Type your email'} label={'Email'} />
      <Input type={'password'} placeholder={'Type your password'} label={'Password'} />
      <FormButton text={'нажми меня!'} />
      <FormButton text={'не нажимай'} />
    </div>
  );
}

export default LoginForm;
