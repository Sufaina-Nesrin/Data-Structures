// here is the same question we have done in the previous
//sumOfTwoNumbers with less complexiety
//In JavaScript, we use the Set data structure to store unique values,
// similar to the HashSet in Java.

const sumOfTwoNumbers = (array, target)=>{
      let set = new Set;
    for(let i = 0; i<array.length; i++){
        num = array[i];
        let match = target - array[i];
        if(set.has(match)){
            return [num,match];
        }
        set.add(num);
    }
    return [];
     
}


let array = [6, 5, 7, 8, 4, 0];
let result = sumOfTwoNumbers(array,10);
console.log(result);


//In JavaScript, the Set data structure is typically implemented as a 
//hash table. Checking if an element exists in a hash table 
//has an average time complexity of O(1), 
//meaning it takes constant time regardless of the size of the set.
