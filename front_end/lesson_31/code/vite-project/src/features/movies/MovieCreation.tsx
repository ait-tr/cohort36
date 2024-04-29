import { FormEvent, useState } from "react";
import { useDispatch } from "react-redux";


export default function MovieCreation():JSX.Element{
    const [title,setTitle] = useState<string>('')
    const [genre,setGenre] = useState<string>('')
    const [country,setCountry] = useState<string>('')
    const today = new Date().toISOString().substring(0,10)
    // создается новый объект Date, затем преобразует его в строку формата ISO
    // (International Organization for Standardization),
    // а затем извлекает подстроку из этой строки, содержащую только первые 10 символов.
    // первые 10 символов ("2024-04-26") представляют дату в формате "год-месяц-день"
    // Таким образом, new Date().toISOString().substring(0, 10) возвращает текущую дату
    // в формате "год-месяц-день".
    const [releaseDate,setRealeseDate] = useState<string>(today)
    const [error,setError] = useState<string>('')

    const dispatch= useDispatch()
    function clearInputsAndError():void{
        setCountry('')
        setGenre('')
        setRealeseDate(today)
        setTitle('')
        setError('') 
        
    }
    function validateInputs():boolean {
      if(title.trim()===""){
        setError('Title is required field ')
        return false
      }
      if(genre.trim()===""){
        setError(' Genre is required field ')
        return false
      }
      if(country.trim()===""){
        setError(' Country is required field ')
        return false
      }
      return true
    }

    function handlSubmit(e:FormEvent<HTMLFormElement>):void{
        e.preventDefault();
        if (validateInputs()){
            dispatch({
                type:'movies/add',
                payload:{
                    title,genre, country, releaseDate
                }
            })
            clearInputsAndError()
        }
    }
    return(
        <div>
            <h1>Форма создания</h1>
            <form onSubmit={handlSubmit}>
            {error && (<div style={{color:'red'}}>{error}</div>)}
            <input type="text" placeholder="title" value={title} onChange={(e)=>setTitle(e.target.value)} />
            <select name="genre" value={genre} onChange={(e)=>setGenre(e.target.value)}>
            <option value="" disabled>genre</option>
            <option value="horror">horror</option>
            <option value="comedy">comedy</option>
            <option value="fantasy">fantasy</option>
            <option value="documentary">documentary</option>
            <option value="18+">18+</option>
            </select>
            <input type="text" placeholder="country" value={country} onChange={(e)=>setCountry(e.target.value)} />
            <input type="date"  value={releaseDate} onChange={(e)=>setRealeseDate(e.target.value)} />
            <button type="submit">Создать</button>
            </form>
        </div>
    )
}

