public class SlinkedList1 {

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
        if(head == null){
            head = newNode;
        }else{
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

    public void delete(int data){
        //DELET FROM HEAD
        Node temp = head,pre =null;
        if(temp !=null && temp.data==data){
            head = temp.next;
            return;

        }
        //note:The temp starts with HEAD
        while(temp !=null && temp.data != data){//loop through when only the data not equal to data and data not equal to null means there should be a data
         pre = temp;
         temp = temp.next;//looping 

        }
        if(temp == null){
            return;
        }
       if(temp ==tail){
             tail = pre;
       tail.next = null;
       return;
       }
       
        pre.next = temp.next;
    }
    public void insertBtwn(int nextTo,int data){
      Node newNode = new Node(data);
      Node temp = head;

      while(temp != null && temp.data != nextTo ){
        temp = temp.next;
      }
      if(temp == null){
        return;
      }
      if(temp == tail){
        tail.next = newNode;
        tail = newNode;
        return;
      }
      newNode.next = temp.next;
      temp.next = newNode;
    }

    public static void main(String[] args) {
        SlinkedList1 newList = new SlinkedList1();
        newList.addNode(7);
        newList.addNode(8);
        newList.addNode(14);
        newList.addNode(9);
        //   newList.delete(9);
        newList.insertBtwn(9,66);
        newList.display();

    }
    
}
