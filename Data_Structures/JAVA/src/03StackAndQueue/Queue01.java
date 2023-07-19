public class Queue01 {
    class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
    }
    
    }
    public Node front;
    public Node rear;

    void enque(int data){
        Node newNode = new Node(data);
        if(rear == null){
          front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    void display(){
        Node current = front;

        if(front == null){
            System.out.println("List is empty");
        }

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    void dequeue(){
        if(front == null){
            System.out.println("empty");
        }
        front = front.next;
        if(front == null){
            rear = null;
        }
    }

    public static void main(String[] args) {
        Queue01 queue = new Queue01();
        queue.enque(7);
        queue.enque(4);
        queue.enque(5);
        queue.enque(6);
        queue.dequeue();
        queue.display();
    }
    
}
