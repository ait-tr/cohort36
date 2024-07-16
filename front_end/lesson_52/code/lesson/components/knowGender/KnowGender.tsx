import { useFormik } from 'formik';
import { FC, useState } from 'react';
import styles from './knowGender.module.css';

interface IFormGender {
  name: string;
}

interface IGender {
  count: number;
  name: string;
  gender: string;
  probability: number;
}

const KnowGender: FC = () => {
  // переменная для хранения
  const [name, setName] = useState<IGender | undefined>(undefined);

  // специальный объект formik - результат вызова хука useFormik() с настройками
  const formik = useFormik({
    initialValues: {
      name: ''
    } as IFormGender,
    onSubmit: async (values: IFormGender, { resetForm }) => {
      // вызов асинхронный функции с fetch запросом
      const res = await fetch(`https://api.genderize.io/?name=${values.name}`);
      const data = await res.json();
      console.log(data);
      setName(data);
      resetForm();
    }
  });

  return (
    <>
      <span>✨ secret gender ✨</span>
      <form onSubmit={formik.handleSubmit} className={styles.container}>
        <input id='name' value={formik.values.name} onChange={formik.handleChange} type="text" />
        <button type='submit'>know secret gender 🤔</button>
      </form>
      {/* если name?.name равен false - элементы не будут показаны */}
      {name?.name && (
        <>
          <p>{name?.name} is {name?.gender} {name?.probability * 100}% ⚡️</p>
        </>
      )}

    </>
  );
};

export default KnowGender;
