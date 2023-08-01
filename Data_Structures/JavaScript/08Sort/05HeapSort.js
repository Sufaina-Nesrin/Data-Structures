function heapSort(arr){
    let heap = arr;

    for(let i=getParent(arr.length-1); i>=0; i--){
        heapify(i, arr.length-1,heap)
    }
    for(let i=heap.length-1; i>0; i--){
        swap(heap, 0, i);
        heapify(0, i-1, heap)
    }
   return heap
}
heapify = (currentIndx,endIndx,heap)=>{
    let leftIndx = getLeftChild(currentIndx);
    let indxToShift = leftIndx;
    while(leftIndx <= endIndx){
        let rightIndx = getRightChild(currentIndx);

        if(rightIndx <= endIndx && heap[rightIndx] > heap[leftIndx]){
            indxToShift = rightIndx
        }
       if(heap[indxToShift] > heap[currentIndx]){
       swap(heap, indxToShift, currentIndx)

        currentIndx = indxToShift;
        leftIndx = getParent(currentIndx);
       }else{
        return
       }
    }

}
swap =(heap, i, j)=>{
    let temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;

}
getParent = (i)=>{
    return Math.floor((i - 1) / 2);
}

getLeftChild = (i)=>{
    return Math.floor((2 * i) + 1);
}

getRightChild = (i)=>{
   return Math.floor((2 * i) + 2)
}

 display =(heap)=>{
    for(let i = 0; i <=heap.length-1; i++){
       console.log(heap[i]);
    }
}

let sortedArray = heapSort([12, 54, 3, 9, 66]);
display(sortedArray);