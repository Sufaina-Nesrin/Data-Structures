class Node{
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

class Queue0{
    constructor(){
        this.front = null;
        this.rear = null;
    }

    enqueue (data){
       const newNode = new Node(data);
       if(this.rear === null){
        this.front = newNode;
       }else{
        this.rear.next = newNode;
       }
       this.rear = newNode

    }

    dequeue (){
        if(this.front === null){
            console.log("Your queue is empty");
            return;
        }
        this.front = this.front.next;
    }

    display (){
        let current = this.front;

        while(current != null){
            console.log(current.data);
            current = current.next;
        }
    }
}

const queue = new Queue0()
queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
queue.enqueue(4);
queue.enqueue(5);
queue.dequeue();

queue.display();