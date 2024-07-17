// import styles from './auth.module.css'

import { useFormik } from 'formik';
import { useAppDispatch } from '../../app/hooks';
import { loginUser } from '../../features/auth/authAction';
import { useNavigate } from 'react-router-dom';
import { getProducts } from '../../features/reduxProducts/reduxProductsAction';


export interface IFormValues {
  username: string;
  password: string;
}

export interface IUserData {
  id: number;
  username: string;
  gender: string;
  email: string;
  image: string;
  firstName: string;
  lastName: string;
  refreshToken: string;
  token: string;
}


export default function Auth() {
  // функция, в которою мы параметром передаем вызов actions из redux
  const dispatch = useAppDispatch()
  // функция для переадресации из react-router-dom
  const navigate = useNavigate()

  const formik = useFormik({
    initialValues: {
      username: 'emilys',
      password: 'emilyspass'
    } as IFormValues,
    onSubmit: async (values: IFormValues, { resetForm }) => {
      // ! здесь мы делаем запрос за данными
      dispatch(loginUser(values))
      dispatch(getProducts());
      resetForm();
      // в navigate мы предаем путь куда мы отправляем пользователя после выполнения действия
      navigate('/')
    }
  });

  return (
    <div>
      <p>username: 'emilys',
        password: 'emilyspass'</p>
      <form onSubmit={formik.handleSubmit}>
        <input name='username' placeholder='username' onChange={formik.handleChange} value={formik.values.username} type="text" />
        <input name='password' placeholder='password' onChange={formik.handleChange} value={formik.values.password} type="text" />
        <button type="submit">log in</button>
      </form>


      {/* {userData.firstName && (
        <>
          <p>Name: {userData.firstName}</p>
          <p>Last name: {userData.lastName}</p>
          <p>Email: {userData.email}</p>
          <img width={200} src={userData.image} alt="" />
        </>)} */}


    </div>
  );
}




