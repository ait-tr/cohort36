import { useEffect, useState } from 'react';

interface BitcoinData{
    bpi:{
        USD:{
            code:string;
            rate:string;
        };
    };
}

export default function Bitcoin(): JSX.Element {
    const [code, setCode] = useState<string>('');
    const [rate, setRate] = useState<string>('');

async function loadBitcoinData(): Promise<void> {
    try {
        const response = await fetch('https://api.coindesk.com/v1/bpi/currentprice.json');
        const data = await response.json();
        const { bpi } = data as BitcoinData;
        const { code, rate } = bpi.USD;
        setCode(code);
        setRate(rate);
    }catch(error){
        console.error("Error loading Bitcoin data:", error)
    }
}
useEffect(()=>{
    loadBitcoinData();
},[]);

return(
    <div>
        <h1>Bitcoin Price</h1>
        <p>Code: {code}</p>
        <p>Rate: {rate}</p>
        <button type="button" onClick={()=>loadBitcoinData()}>Refresh</button>
    </div>  
);
}