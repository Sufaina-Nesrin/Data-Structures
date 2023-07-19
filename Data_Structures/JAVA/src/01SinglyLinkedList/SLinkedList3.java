public class SLinkedList3 {

    class Node{
        int data;
        Node next;
        

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
            
        } 
        tail = newNode;
    }

    public void removeDuplicate(){
        Node current = head;

        while(current != null){//loop main
            Node next = current.next;
            while(next != null && next.data == current.data){//loop for duplicates
                next = next.next;
            }
            current.next = next;
            if(next == tail && current.data == next.data){
              tail = current;
              tail.next = null;
            }
            current = next;
        }
    }

public void display(){
    Node temp = head;

    while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
    }
}
public static void main(String[] args) {
   SLinkedList3 list = new SLinkedList3();
   list.addNode(6) ;
   list.addNode(10);
   list.addNode(5);
   list.addNode(5);
   list.addNode(5);
   list.addNode(8);
   list.addNode(8); 
   list.removeDuplicate();
   list.display();
}
   
    
}
