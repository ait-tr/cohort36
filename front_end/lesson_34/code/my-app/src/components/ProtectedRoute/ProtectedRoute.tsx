// eslint-disable-next-line import/no-extraneous-dependencies
import { Navigate } from 'react-router-dom'
import { useAppSelector } from '../../app/hooks'
import { selectUser } from '../../features/auth/selectors'

interface Props {
	outlet: JSX.Element
}

export default function ProtectedRoute({ outlet }: Props): JSX.Element {
	const user = useAppSelector(selectUser) // получили user или undefined
	if (user) {
		return outlet
	}
	return <Navigate to="../login" /> // компонент, который делает редирект
}
// Интерфейс Props: Определен интерфейс Props, который описывает структуру объекта,
// ожидаемого в качестве параметра для компонента ProtectedRoute.
// В данном случае, компонент ожидает объект с именем outlet, который представляет собой элемент JSX.
// Функция ProtectedRoute: Экспортируемая функция ProtectedRoute принимает объект Props и возвращает элемент JSX.
// Она сначала использует хук useAppSelector для получения текущего пользователя из глобального состояния приложения.
//  Если пользователь существует (то есть, если переменная user не равна undefined),
// компонент возвращает outlet (элемент JSX), который был передан в качестве свойства. Если пользователь не существует,
// компонент возвращает <Navigate to="../login" />, что приведет к перенаправлению на страницу входа.
