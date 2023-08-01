function bubbleSort(arr){
    let n = arr.length;
    for(let i=0; i<n; i++){
        for(let j=0; j<n-i; j++){
           if(arr[j] > arr[j+1]){

            let temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
           } 
        }
    }
    return arr;
}
let array = [12, 67, 37, 6, 22, 1, 5];
let result = bubbleSort(array);
console.log(result);