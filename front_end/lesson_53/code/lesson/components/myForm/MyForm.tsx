import { useFormik } from 'formik';
import { FC, useContext } from 'react';
import * as Yup from 'yup';
import styles from './myForm.module.css';
import { UserContext } from '../userContext/UserContext';


interface IFormValues {
  firstName: string;
  lastName: string;
  email: string;
}

const MyForm: FC = () => {
  // вызываем хук useContext для работы с контекстом из компонентов
  // передаем импортированный контекст в качестве параметра
  // получаем через деструктуризацию данные из контекста

  const {setUser} = useContext(UserContext)

  // описали схему для валидации👨‍⚕️
  const schema = Yup
    .object()
    .shape({
      // firstName это строка, поле обязательное
      firstName: Yup
        .number()
        .typeError('Введи свой номер, робот 👨‍⚕️')
        .required('Имя обязательно')
        .min(100, 'твоя модель начинается с номера 100!')
        .max(1000, 'ты не такой новый робот! модель до 1000...'),
      // lastName это строка, поле обязательное
      lastName: Yup
        .string()
        .required('Введи фамилию создателя!'),
      // email это строка, это формат email, поле обязательное
      email: Yup
        .string()
        .email('Некорректный формат email')
        .required('Email обязателен')
    });


  const formik = useFormik(
    {
      initialValues: {
        firstName: '',
        lastName: '',
        email: '',
      } as IFormValues,
      // добавили схему в formik
      validationSchema: schema,
      // изменили валидацию по умолчанию
      // теперь она по нажатию на кнопку
      // а не на каждое изменение
      validateOnChange: false,
      onSubmit: (values: IFormValues) => {
        // здесь мог бы быть fetch запрос на бек
        // или обращение к api
        setUser(values)
        console.log(values);
      }
    });




  return (
    <form onSubmit={formik.handleSubmit} className={styles.container}>
      <label htmlFor="">Это форма для 🤖</label>
      <input
        type="text"
        placeholder='твой номер'
        id='firstName'
        onChange={formik.handleChange}
        value={formik.values.firstName} />
      <input
        type="text"
        placeholder='твой создатель'
        id='lastName'
        onChange={formik.handleChange}
        value={formik.values.lastName}
      />
      <input
        type="text"
        placeholder='email компании'
        id='email'
        onChange={formik.handleChange}
        value={formik.values.email}
      />
      <button type='submit'>send data 📲</button>
      <span>{formik.errors.email}</span>
      <span>{formik.errors.firstName}</span>
      <span>{formik.errors.lastName}</span>
    </form>

  );
};

export default MyForm;
