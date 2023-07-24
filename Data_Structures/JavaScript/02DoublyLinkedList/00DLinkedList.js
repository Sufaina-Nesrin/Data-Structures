class Node {
    constructor(data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DLinkedList0{
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
        newNode.prev = this.tail;
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

 delete(data){
    //FROM HEAD
    let temp = head;
    let prev = null;
    if(temp != null && temp.data == data){
        head = temp.next;
        return;
       
    }
    while(temp != null && temp.data != data){
           prev = temp;
           temp = temp.next;
         }
         if(temp == null){
            return;
         }
         if(temp == tail){
            this.tail = prev;
            prev.next = null; 
            return;
         }
        
         prev.next = temp.next;
         temp.next.prev = prev;
    
      }

  insertAfter( pos, data){
      let temp = this.head;
       const newObj = new Node(data);
        while(temp != null && temp.data != pos){
            temp = temp.next;
        }
        if(temp == null){
            return;
        }
      newObj.next = temp.next;
      newObj.prev = temp;
       if (temp.next != null) {
            temp.next.prev = newObj;
        }
      temp.next =newObj;   
    }

   revDisplay(){
        let temp = this.tail;
    
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }

     revDisplay(){
       let temp = this.tail;
    
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
  insertBefore(pos, data){
       let temp = head;
       const newObj = new Node(data);
        while(temp.data != pos && temp !=null ){
            temp = temp.next;
    
        }
        if(temp == null){
            return;
        }
        newObj.next = temp;
        newObj.prev = temp.prev;
    
        if (temp.prev != null) {
            temp.prev.next = newObj;
        }
    
        temp.prev = newObj;
    
        if (temp == head) {
            head = newObj;
        }
}
}

const list = new DLinkedList0();
list.addNode(5);
list.addNode(4);
list.addNode(67);
list.addNode(34);

list.display();