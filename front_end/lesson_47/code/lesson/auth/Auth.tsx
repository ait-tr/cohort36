// import styles from './auth.module.css'

import { useFormik } from 'formik';
import { useState } from 'react';


interface IFormValues {
  username: string;
  password: string;
}

interface IUserData {
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

const initial = {
  id: 0,
  username: '',
  gender: '',
  email: '',
  image: '',
  firstName: '',
  lastName: '',
  refreshToken: '',
  token: '',
};


export default function Auth() {
  const [userData, setUserData] = useState<IUserData>(initial);

  const formik = useFormik({
    initialValues: {
      username: '',
      password: ''
    } as IFormValues,
    onSubmit: async (values: IFormValues, { resetForm }) => {
      const res = await fetch('https://dummyjson.com/user/login', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          username: values.username,
          password: values.password
        })
      });
      const data = await res.json();
      setUserData(data);
      resetForm();
    }
  });

  // async function loginData(values: IFormValues) {
  //   const res = await fetch('https://dummyjson.com/user/login', {
  //     method: 'POST',
  //     headers: { 'Content-Type': 'application/json' },
  //     body: JSON.stringify({
  //       username: values.username,
  //       password: values.password
  //     })
  //   });
  //   const data = await res.json()
  //   console.log(data);
  // }

  return (
    <div>
      <span>Formik auth</span>
      <p>username: 'emilys',
        password: 'emilyspass'</p>
      <form onSubmit={formik.handleSubmit}>
        <input name='username' placeholder='username' onChange={formik.handleChange} value={formik.values.username} type="text" />
        <input name='password' placeholder='password' onChange={formik.handleChange} value={formik.values.password} type="text" />
        <button type="submit">log in</button>
      </form>


      {userData.firstName && (
        <>
          <p>Name: {userData.firstName}</p>
          <p>Last name: {userData.lastName}</p>
          <p>Email: {userData.email}</p>
          <img width={200} src={userData.image} alt="" />
        </>)}


    </div>
  );
}




