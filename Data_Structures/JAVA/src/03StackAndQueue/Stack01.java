public class Stack01 {
   class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
   } 


public Node top;

public void push(int data){
    Node newObj = new Node(data);
    if(top == null){
        top = newObj;
    }else{
        newObj.next = top;//assigning previous top elemnt to the next of new object
        top = newObj;// then changing top as new elelemnt or newObj
    }
}

public void pop(){
    if(top == null){
        System.out.println("stack overflow");
        return;
    }
    top = top.next;
}
public void display(){
    Node current = top;

    while(current != null){
        System.out.println(current.data);
        current = current.next;
    }
}
public static void main(String[] args) {
    Stack01 stack = new Stack01();
    stack.push(1);
     stack.push(2);
      stack.push(3);
       stack.push(4);
       stack.pop();
       stack.display();

}
}