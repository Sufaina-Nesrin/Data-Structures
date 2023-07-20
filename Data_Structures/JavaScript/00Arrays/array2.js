//we input an array and a target from the user then, 
//we have to print targeted number in last positions even if it comes
//in multiple time in that array;

const moveToTheLast = (array, target)=>{
 i = 0;
 j = array.length -1;
 while(i < j){
    if(array[i]== target && array[j] == target){
        j--;
    }else if(array[i]== target && array[j]!=target){
        let temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        j--;
    }else if(array[i]!= target && array[j]!= target){
        i++;
    } else{
        i++;
    }
 }
 return array;
}

let array = [5, 4, 5, 14, 3, 6, 5, 5 ]
let result = moveToTheLast(array, 5);
console.log(result);