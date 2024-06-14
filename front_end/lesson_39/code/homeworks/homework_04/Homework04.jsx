import LoginForm from '../../components/loginForm/LoginForm';
import Section from '../../components/section/Section';

function Homework04() {
  return (
    <>
      <span>lesson 05</span>
      <LoginForm />
      <Section title={'first'}>
        {/* здесь props это не только title, но и  теги */}
        <p>Это способ, как можно передать в компонент данные в тегах</p>
        <p>Любое кол-во данных</p>
        <p>Можно передать столько тегов, сколько удобно</p>
      </Section>
      <Section title={'second'}>
        <p>А здесь уже совсем другие данные, хотя это и тот же компонент</p>
        <a>Ccылка</a>
      </Section>
      <Section title="third" />
    </>
  );
}

export default Homework04;
