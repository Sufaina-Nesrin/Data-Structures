class MaxHeap{
    constructor(array){
        this.heap = [];
    }

    buildHeap (array){
      this.heap =[...array];
      for(let i=this.getParent(this.heap.length-1); i>=0; i--){
        this.shiftDown(i);
      }
    }
shiftDown(currentIndx){
    let leftIndx = this.getLeftChild(currentIndx);
    let endIndx = this.heap.length-1
    let indxToShift;

    while(leftIndx <= endIndx){
        indxToShift = leftIndx;
        let rightIndx = this.getRightChild(currentIndx);
        if(rightIndx <= endIndx && this.heap[leftIndx]< this.heap[rightIndx]){
            indxToShift  = rightIndx;
        }
        if(this.heap[indxToShift] > this.heap[currentIndx]){
            let temp = this.heap[indxToShift];
            this.heap[indxToShift] = this.heap[currentIndx];
            this.heap[currentIndx] = temp;

            currentIndx = indxToShift;//parent
            leftIndx = this.getLeftChild(currentIndx);
        }else{
            return
        }
    }
}

//remove
remove (){
 let temp = this.heap[0];
 this.heap[0] = this.heap[this.heap.length-1];
 this.heap[this.heap.length-1] = temp;

 this.heap.pop()
 for(let i = 0; i<=this.heap.length-1; i++){
    this.shiftDown(i);
 }
}

//insert 
insert (data){
    this.heap.push(data);
    for(let i =this.heap.length-1; i>=0; i--){
        this.shiftUp(i)
    }
}

shiftUp(currentIndx){
    let parentIndx = this.getParent(currentIndx);

    while(currentIndx > 0&& this.heap[currentIndx] > this.heap[parentIndx]){
        let temp = this.heap[currentIndx];
        this.heap[currentIndx] = this.heap[parentIndx];
        this.heap[parentIndx] =temp;

        currentIndx = parentIndx;
        parentIndx = this.getParent(currentIndx);
    }
}
display (){
 for(let i=0; i<=this.heap.length-1; i++){
    console.log(heap[i]);
 }
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
   
     display(){
        for(let i = 0; i <=this.heap.length-1; i++){
           console.log(this.heap[i]);
        }
    }
}


const maxHeap = new MaxHeap();
maxHeap.buildHeap([3,54,7,89,1]);
// maxHeap.remove();
maxHeap.insert(122);
maxHeap.display();