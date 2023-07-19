public class DLinkedList0 {

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }
    
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        //whether a first data adding
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
        } 
        tail = newNode;
    }

public void display(){
    Node temp = head;

    while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
    }
}

public void delete(int data){
//FROM HEAD
Node temp = head,prev = null;
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
        tail = prev;
        prev.next = null; 
        return;
     }
    
     prev.next = temp.next;
     temp.next.prev = prev;

  }
public void insertAfter(int pos,int data){
    Node temp = head;
    Node newObj = new Node(data);
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
public void revDisplay(){
    Node temp = tail;

    while(temp != null){
        System.out.println(temp.data);
        temp = temp.prev;
    }
}
public void insertBefore(int pos,int data){
    Node temp = head;
Node newObj = new Node(data);
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
        public static void main(String[] args) {
            DLinkedList0 list = new DLinkedList0();

            list.addNode(5);
            list.addNode(10);
            list.addNode(15);
             list.insertBefore(10,11);
            
            //  list.insertAfter(10,8);

            list.display();
           
        }

}
