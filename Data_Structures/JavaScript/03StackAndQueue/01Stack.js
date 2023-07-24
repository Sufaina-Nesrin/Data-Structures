class Node{
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

class Stack01{
    constructor(){
        this.top = null;
    }

    push (data){
     const newObj = new Node(data);
     if(this.top === null){
        this.top = newObj;
     }else{
       newObj.next = this.top// to refrence of the previous element
        this.top = newObj;
     }
    }

    pop (){
      if(this.top === null){
       console.log("Your stack is empty");
       return;
      }
      this.top = this.top.next;
}
display (){
    let current = this.top;
    while(current !== null){
        console.log(current.data);
        current = current.next;
    }
}
}

const stack = new Stack01();
stack.push(1);
stack.push(2);
stack.push(3);
stack.push(4);
stack.push(5);

stack.pop()

stack.display();