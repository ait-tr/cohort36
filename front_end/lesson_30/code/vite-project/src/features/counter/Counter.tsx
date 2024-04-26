import { useDispatch, useSelector } from "react-redux";
import { RootState } from "../../store";

export default function Counter():JSX.Element{
    const dispatch = useDispatch();
    
    function handlePlus():void{
        // dispatch - мы вызываем, когда хотим изменить централизованное состояние
        dispatch({type:'counter/plus', payload: 1})
    }
    function handleMinus():void{
        // dispatch - мы вызываем, когда хотим изменить централизованное состояние
        dispatch({type:'counter/minus', payload: 1})
    }

    function handleReset():void{
        dispatch({type:'counter/reset'});
    }
      // useSelector - это как гетер - для получения центролоизованного состояния
    const counter = useSelector((state:RootState)=>state.counter.value);
    return(
        <div>
            <button type="button" onClick={handlePlus}>+</button>
            {counter}
            <button type="button" onClick={handleMinus}>-</button>
            <button type="button" onClick={handleReset}>Reset</button>
        </div>

    )






}