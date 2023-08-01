function quickSort(arr){
    quickSortHelper(arr, 0 , arr.length-1);
    return arr;

}

function quickSortHelper(arr, startIndx, endIndx){

   if(startIndx >= endIndx){//Base case for quickSortHelper recursive fn
        return
    }

    let pivotIndx = startIndx;
    let leftIndx = startIndx + 1;
    let rightIndx = endIndx;

    while(leftIndx <= rightIndx){
        if(arr[leftIndx] > arr[pivotIndx] && arr[rightIndx] < arr[pivotIndx]){
            swap(arr, leftIndx, rightIndx);
            leftIndx++;
            rightIndx--

        }
         if(arr[leftIndx] <= arr[pivotIndx]){
            leftIndx ++;
         }
         if(arr[rightIndx] >= arr[pivotIndx]){
            rightIndx --;
         }
    }
    swap(arr, rightIndx, pivotIndx);
    quickSortHelper(arr, pivotIndx, rightIndx-1);//leftSubArray
    quickSortHelper(arr, rightIndx+1, endIndx);//rightSubArray

   
}

function swap(arr, i, j){
    let temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

console.log(quickSort([43, 5, 12, 3, 1]));
console.log(quickSort([30, 2, 41, 56, 12, 11, 22]))