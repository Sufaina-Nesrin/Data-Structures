//In previous question we have learned to create and display linkedList
//Here we are going to delete and insertBtwn

class Node{
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

class SLinkedList02{
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

//delete
delete (target){
    let temp = this.head
    let pre = null

    //intially temp = head
    //checking the target is in head
if(temp !=null &&temp.data == target){
   this.head = temp.next;
   return
}

  while(temp != null && temp.data != target){
     pre = temp;
     temp = temp.next;
  }

  // here temp = target
  //checking the target is null
  if(temp == null){
    return
  }
//temp = target
//checking target is in tail
  if(temp == this.tail){
    this.tail = pre;
    pre.next = null;
    return
  }
//if none of these ,
//then target is in btwn nodes
  pre.next = temp.next;
}

//InsertBtwn
insert (nextTo,data){
    const newNode = new Node(data);
 let temp = this.head;
 

    while(temp != null && temp.data != nextTo){
        temp = temp.next;
    }    
      if(temp == null){
        return
      }
        if(temp == this.tail){
            this.tail.next = newNode;
            newNode.next = null
            return
        }
        
    newNode.next = temp.next;
    temp.next = newNode;
}

}

const list = new SLinkedList02();
list.addNode(51);
list.addNode(34);
list.addNode(60);
list.addNode(21);
 list.delete(20);
list.insert(20,5);

list.display();