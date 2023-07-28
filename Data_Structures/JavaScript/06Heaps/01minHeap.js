let heap = [];
function minHeap(array){
    buildHeap(array);

}

const buildHeap = (arr) =>{
    heap = arr;
    for(let i = getParent(arr.length-1); i>=0; i--){
        shiftDown(i);//last parent
    }
}

//Remove : only the first or top most element will be removed
function remove() {
    let temp = heap[0];
    heap[0] = heap[heap.length - 1];
    heap[heap.length - 1] = temp;

    heap.pop(); 
    shiftDown(0);
}

//Insertion
function insert (data){
    heap.push(data);

    shifUp(heap.length-1);
}

const shifUp = (currentIndx)=>{
let parentIndx = getParent(currentIndx);
while(currentIndx > 0 && heap[currentIndx] < heap[parentIndx]){
    let temp = heap[currentIndx];
    heap[currentIndx] = heap[parentIndx];
    heap[parentIndx] = temp;

    currentIndx = parentIndx;
    parentIndx = getParent(currentIndx);
}
}
const shiftDown = (currentIndx) => {
    let endIndx = heap.length - 1;
    let leftIndx = getLeftChild(currentIndx);
    let indxToShift;

    while (leftIndx <= endIndx) { 
        let rightIndx = getRightChild(currentIndx);
        indxToShift = leftIndx;
        if (rightIndx <= endIndx && heap[rightIndx] < heap[leftIndx]) { // Update the condition for right child
            indxToShift = rightIndx;
        }
        if (heap[currentIndx] > heap[indxToShift]) {
            let temp = heap[currentIndx];
            heap[currentIndx] = heap[indxToShift];
            heap[indxToShift] = temp;

            currentIndx = indxToShift;
            leftIndx = getLeftChild(currentIndx);
        } else {
            return;
        }
    }
};


const getParent = (i)=>{
    return Math.floor((i - 1) / 2);
}

const getLeftChild = (i)=>{
    return Math.floor((2 * i) + 1);
}

const getRightChild = (i)=>{
   return Math.floor((2 * i) + 2)
}

//display
function display(){
    for(let i = 0; i < heap.length; i++){
       console.log(heap[i]);
    }
}

let array = [13, 16, 5, 7, 62];
buildHeap(array);
//display();
//remove();
insert(3);
display();