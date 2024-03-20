function getName(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve("John Smith")
        },1000)
    })
}
console.log(getName());
// Обработка с помощью then
getName().then((data)=>{
    console.log(data)
});

async function f(){
const response = await getName()// с помощью await мы можем раскрывать промисы
console.log(response)
}
f()

// Две одинаковые функции,которые возвращают промисы 5

function getFiveVer1(){
    return new Promise (function(resolve,reject){
        resolve(5)
    })
}
// вот тоже самое с помощью async await

async function  getFive(){
    return 5;
}
console.log(getFive()); // promise {5}