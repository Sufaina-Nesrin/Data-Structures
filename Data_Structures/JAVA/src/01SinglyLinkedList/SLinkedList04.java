public class SLinkedList04 {
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
      Node newObj = new Node(data);
         if(head == null){
            head = newObj;
         }else{
            tail.next = newObj;
         }
         tail = newObj;
    }

    public void display(){
        Node temp = head;
       while(temp != null){
           System.out.println(temp.data);
           temp = temp.next;
       }
    }

    public void reverse(){
        Node temp = head,prev = null,next = null;
        while(temp != null){
          prev = temp;
          next = temp.next;
          if(prev.next == next && next.next == null){
            head = next;
            head.next = prev;
            
          }
        }
    }
   public static void main(String[] args) {
     SLinkedList04 list = new SLinkedList04();
    list.addNode(4);
    list.addNode(5);
    list.addNode(6);
    // list.reverse();
    list.display();

   }
   
}
