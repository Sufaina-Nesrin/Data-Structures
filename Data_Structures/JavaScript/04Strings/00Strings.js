//Encoding a string with a key value that user provided;

const encoding = (str, key)=>{
    let arr = [];
    //we can also use key % 122 :it is good practice
    let numToAdd = key;
    for(let i=0; i<str.length; i++){
       let asciiCode = str.charCodeAt(i)+numToAdd;
       if(asciiCode <= 122){
        arr.push( String.fromCharCode(asciiCode));
       }else{
        //we can also use asciiCode % 122 :it is good practice
        arr.push(String.fromCharCode((asciiCode-122)+96));
       }
    }
return arr;
}

let result = encoding("xyza",1);
console.log(result);