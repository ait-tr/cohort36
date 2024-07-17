import { createContext, ReactNode, useState } from 'react';

// типы данных в стейт
interface IFormValues {
  firstName: string;
  lastName: string;
  email: string;
}


// типизация контекста
interface IUserContext {
  user: IFormValues,
  setUser: React.Dispatch<React.SetStateAction<IFormValues>>;
  message: string
}

// протипизировали children -
// заместо этого значения придут любые компоненты
// которые мы обернем в UserProvider - обертку с контекстом
interface IUserProviderProps {
  // ReactNode - внутренний тип React
  // для типизации React компонента
  children: ReactNode;
}

// создаем начальные значения для контекста
const initialContext: IUserContext = {
  user: {
    firstName: '',
    lastName: '',
    email: '',
  },
  setUser: () => { },
  message: ''
};

// создали сам контекст, передали начальное значение и экспортировали
export const UserContext = createContext<IUserContext>(initialContext);

// ! создали компонент обертку для всего приложения, чтобы иметь доступ к контексту
export function UserProvider({ children }: IUserProviderProps) {

  // ! то ради чего мы создавали контекст
  // эти данные и функция их изменяющая будут доступны в любом компоненте
  const [user, setUser] = useState({
    firstName: '',
    lastName: '',
    email: ''
  });

  const message = 'bye-bye from context 🙋‍♂️'


  return (
    // ! передаем в value значение
    <UserContext.Provider value={{ user, setUser, message }}>
      {children}
    </UserContext.Provider>
  );
}






