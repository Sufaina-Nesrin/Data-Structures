//Remove consecutive duplicates 
class Node{
    constructor(data){
        this.data = data;
        this.next = null
    }
}

class SLinkedList03{
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

    removeDuplicates (){
        let current = this.head;

        while(current != null){//loop main
            let next = current.next;
            while(next != null && next.data == current.data){//loop for duplicates
                next = next.next;
            }
            current.next = next;
            if(next == this.tail && current.data == next.data){
              this.tail = current;
              this.tail.next = null;
            }
            current = next;
        }
    }
}

const list = new SLinkedList03();
list.addNode(1);
list.addNode(1);
list.addNode(2);
list.addNode(2);
list.addNode(17);
list.addNode(23);
list.addNode(62);
list.removeDuplicates();


list.display();