import type { RenderOptions } from '@testing-library/react'
import { render } from '@testing-library/react'
import userEvent from '@testing-library/user-event'
import type { PropsWithChildren, ReactElement } from 'react'
import { Provider } from 'react-redux'
import type { AppStore, RootState } from '../app/store'
import { makeStore } from '../app/store'

/**
 * This type extends the default options for
 * React Testing Library's render function. It allows for
 * additional configuration such as specifying an initial Redux state and
 * a custom store instance.
 */
interface ExtendedRenderOptions extends Omit<RenderOptions, 'queries'> {
	/**
	 * Defines a specific portion or the entire initial state for the Redux store.
	 * This is particularly useful for initializing the state in a
	 * controlled manner during testing, allowing components to be rendered
	 * with predetermined state conditions.
	 */
	preloadedState?: Partial<RootState>

	/**
	 * Allows the use of a specific Redux store instance instead of a
	 * default or global store. This flexibility is beneficial when
	 * testing components with unique store requirements or when isolating
	 * tests from a global store state. The custom store should be configured
	 * to match the structure and middleware of the store used by the application.
	 *
	 * @default makeStore(preloadedState)
	 */
	store?: AppStore
}

/**
 * Renders the given React element with Redux Provider and custom store.
 * This function is useful for testing components that are connected to the Redux store.
 *
 * @param ui - The React component or element to render.
 * @param extendedRenderOptions - Optional configuration options for rendering. This includes `preloadedState` for initial Redux state and `store` for a specific Redux store instance. Any additional properties are passed to React Testing Library's render function.
 * @returns An object containing the Redux store used in the render, User event API for simulating user interactions in tests, and all of React Testing Library's query functions for testing the component.
 */
export const renderWithProviders = (
	ui: ReactElement,
	extendedRenderOptions: ExtendedRenderOptions = {}
) => {
	const {
		preloadedState = {},
		// Automatically create a store instance if no store was passed in
		store = makeStore(preloadedState),
		...renderOptions
	} = extendedRenderOptions

	const Wrapper = ({ children }: PropsWithChildren) => <Provider store={store}>{children}</Provider>

	// Return an object with the store and all of RTL's query functions
	return {
		store,
		user: userEvent.setup(),
		...render(ui, { wrapper: Wrapper, ...renderOptions }),
	}
}



// Этот код предоставляет утилитарную функцию renderWithProviders для тестирования компонентов React,
// которые подключены к хранилищу Redux с использованием библиотеки тестирования React Testing Library.
// Давайте разберем, что делает каждая часть кода:

// Импорты:
// Код импортирует необходимые модули из @testing-library/react для отображения компонентов и имитации действий пользователя, а также типы, связанные с параметрами отображения и элементами React.
// Также импортируется компонент Provider из react-redux для обертывания компонентов контекстом хранилища Redux.
// Импортируются типы, связанные с хранилищем Redux (AppStore и RootState) из модуля хранилища приложения.
// Интерфейс ExtendedRenderOptions:
// Этот интерфейс расширяет стандартные параметры функции render, предоставленной библиотекой React Testing Library.
// Он позволяет настроить дополнительные параметры, такие как начальное состояние Redux (preloadedState) и пользовательский экземпляр хранилища Redux (store).
// Функция renderWithProviders:
// Эта функция принимает два параметра:
// ui: Компонент React или элемент для отображения.
// extendedRenderOptions: Необязательные параметры конфигурации отображения, включая preloadedState и store, а также любые дополнительные свойства, передаваемые в функцию render из React Testing Library.
// Внутри функции:
// Извлекаются preloadedState, store и другие параметры отображения из extendedRenderOptions с использованием деструктуризации с значениями по умолчанию.
// Определяется компонент Wrapper, который оборачивает предоставленный интерфейс с компонентом Provider, передавая хранилище Redux в качестве свойства.
// Возвращается объект, содержащий:
// store: Используемое при отображении хранилище Redux.
// user: API пользовательских событий для имитации действий пользователя в тестах.
// Все функции запросов React Testing Library для тестирования компонента (...render(ui, { wrapper: Wrapper, ...renderOptions })).
// В целом, эта утилитарная функция упрощает тестирование компонентов, связанных с Redux, путем обработки настройки поставщика Redux и конфигурации хранилища.
