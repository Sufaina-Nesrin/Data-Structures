public class SLinkedList04 {

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public Node head = null;
    public Node tail = null;

    public void insert(int data){
        Node newObj = new Node(data);
        if(head == null){
            head = newObj;
        }else{
            tail.next = newObj;
        }
        tail = newObj;//itration
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
    
        while (current != null) {
            next = current.next; // Save the next node
    
            current.next = prev; // Reverse the link
    
            prev = current;
            current = next;
        }
    
        // Update the head and tail pointers
        tail = head;
        head = prev;
    }
    
    public static void main(String[] args) {
        SLinkedList04 list = new SLinkedList04();
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.reverse();

        list.display();
    }


    
}
