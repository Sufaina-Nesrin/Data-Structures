function selectionSort(arr){
    for(let i=0; i<arr.length; i++){
        let minIndx = i
        for(let j=i+1; j<arr.length; j++){
            if(arr[j] < arr[minIndx]){
                minIndx = j;
    
            }
            }
               let temp = arr[i];
                arr[i] = arr[minIndx];
                arr[minIndx] = temp;
      
    }
    return arr;
}

console.log(selectionSort([3, 12, 5, 43, 1]));