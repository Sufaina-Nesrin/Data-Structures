public class SLinkedList0 {
    
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        
    }

    public void display() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            System.out.println("new node added");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SLinkedList0 list = new SLinkedList0();
        list.display();
        list.addNode(10);
        list.addNode(20);
        list.addNode(50);

        list.display();
    }
}


