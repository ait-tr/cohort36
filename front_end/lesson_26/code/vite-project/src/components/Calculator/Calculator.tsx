import React, { useState } from 'react'

function Calculator():JSX.Element{
    const [input, setInput]=useState<string>('');
    const [result, setResult]= useState<number | null>(null);
     // В компоненте определены два состояния: input и result.
// input используется для отслеживания введенного пользователем
// математического выражения.
// result используется для хранения результата вычисления выражения.

const handleInputChange =(event:React.ChangeEvent<HTMLInputElement>)=>{
    setInput(event.target.value)
};
 // handleInputChange: обработчик изменения ввода.
  // При вызове этой функции обновляется состояние input с новым значением,
  // введенным пользователем.

  const handlerCalculate = ()=>{
    try{
        const expressionResult = eval(input);
        //  // библиотека math.js лучше чем функция eval() 
        setResult(expressionResult);
    }catch(error){
        setResult(null)
    }
  };
  return(
<div>
    <h2>Калькулятор</h2>
    <input
     type="text"
      value={input}
      placeholder='Введите выражение'
      onChange={handleInputChange}
        />
        <button onClick={handlerCalculate}>Вычислить</button>
        {
        result!==null &&(
            <div>
                <h3>Результат:</h3>
                <p>{result}</p>
            </div>
        )
        }
</div>
  )
}
export default Calculator;