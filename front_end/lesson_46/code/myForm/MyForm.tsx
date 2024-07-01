import { useFormik } from 'formik';
import { FC } from 'react';
import styles from './myForm.module.css';


interface IFormValues {
  firstName: string;
  lastName: string;
  email: string;
}


const MyForm: FC = () => {
  // хук из formik useFormik() принимает в себя объект с ключами:
  // по ключу initialValues - объект с описанием полей input и их начальным значением
  // по ключу onSubmit- функция для описание действия по событию submit
  const formik = useFormik(
    {
      // ! ключи в initialValues должны обязательно соответствовать id в input 🔑
      // * иначе форма не будет работать 😢
      initialValues: {
        firstName: '',
        lastName: '',
        email: ''
      } as IFormValues,
      onSubmit: (values: IFormValues) => {
        console.log('My name is', values.firstName, values.firstName, '!');
        console.log('My email:', values.email);
      }
    });






  return (
    // handleSubmit - специальный сгенерированный библиотекой formik метод, на основе наших данных переданных в useFormik()
    <form onSubmit={formik.handleSubmit} className={styles.container}>
      <input
        type="text"
        placeholder='firstName'
        id='firstName'
        onChange={formik.handleChange}
        value={formik.values.firstName} />
      <input
        type="text"
        placeholder='lastName'
        id='lastName'
        onChange={formik.handleChange}
        value={formik.values.lastName}
      />
      <input
        type="email"
        placeholder='email'
        id='email'
        onChange={formik.handleChange}
        value={formik.values.email}
      />
      <button type='submit'>send data 📲</button>
    </form>

  );
};

export default MyForm;
