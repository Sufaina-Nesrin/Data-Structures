class Node {
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

class SlinkedList{
    constructor(){
        this.head = null;
        this.tail = null; 
    }


 addNode (data){
    const newNode = new Node(data);
    if(this.head == null){
        this.head = newNode;
    }else{
        this.tail.next = newNode;
    }
    this.tail = newNode;
}

 display  (){
    let temp = this.head;
    while(temp!=null){
        console.log(temp.data);
        temp = temp.next
    }
}
}

const list = new SlinkedList();
list.addNode(5);
list.addNode(4);
list.addNode(67);
list.addNode(34);

list.display();