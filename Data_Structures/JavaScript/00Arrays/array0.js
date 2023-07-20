//user enters a target number, we have to find two numbers from array
// the sum of the numbers should be equal to the target number

const sumOfTwoNumbers = (array,target)=>{
    let newArray = [];
    for(let i= 0;i <=array.length; i++){
        for(j=0; j<=array.length; j++){
            if(array[i] == array[j]){
                continue;
            }else if(array[i]+ array[j] == target){
                newArray.push(array[i]);
                newArray.push(array[j]);
                return newArray;
               
            }
        }
    }

}

const array = [6, 5, 13, 4, 9, 0]
let result = sumOfTwoNumbers(array,10);
console.log(result);

//Here we have used two nested array ,so the time complexiety is O(n^2)