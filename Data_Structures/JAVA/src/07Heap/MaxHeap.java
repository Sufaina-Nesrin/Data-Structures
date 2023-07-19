import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class MaxHeap {

List<Integer> heap = new ArrayList<>();

//constructor 1
public MaxHeap(){

}

public MaxHeap(List<Integer>array){
    buildHeap(array);

}
  
public void buildHeap(List<Integer> array){
 heap = array; // Create a new copy of the array
// int currentIndx = parent(heap.size()-1);
for(int i = parent(heap.size()-1); i >= 0; i--){
       shiftDown(i);
}

} 

private void shiftDown(int currentIndx) {
    int endIndx = heap.size() - 1;
    int leftIndx = leftChild(currentIndx);

    while (leftIndx <= endIndx) {
        int rightIndx = rightChild(currentIndx);
        int indxToshift;

        if (rightIndx <= endIndx && heap.get(rightIndx) > heap.get(leftIndx)) {
            indxToshift = rightIndx;
        } else {
            indxToshift = leftIndx;
        }

        if (heap.get(currentIndx) < heap.get(indxToshift)) {
            Collections.swap(heap, currentIndx, indxToshift);
            currentIndx = indxToshift;
            leftIndx = leftChild(currentIndx);
        } else {
            return;
        }
    }
}
private void shiftUp(int currentIndx){
int parentIndx = parent(currentIndx);

    while(currentIndx > 0 && heap.get(parentIndx) < heap.get(currentIndx)){
     Collections.swap(heap, currentIndx, parentIndx);
     currentIndx = parentIndx;
     parentIndx = parent(currentIndx);
    }

}
public void insert(int value){
      heap.add(value);
      shiftUp(heap.size()-1);
    }

public void remove(){
    Collections.swap(heap, 0, heap.size()-1);
    heap.remove(heap.size()-1);
    shiftDown(0);

}

public int peak(){
    if(heap.get(0) == null){
        System.out.println("Heap is Empty!");
        return 0;
    }
    return heap.get(0);

}

private int parent(int i){
     return (i - 1) / 2;
}

private int leftChild(int i){
    return (i * 2) + 1;
}

private int rightChild(int i){
    return (i * 2) + 2;
}
 public void display(){
        for(int i = 0; i < heap.size(); i++){
            System.out.println(heap.get(i));
        }
    }

public static void main(String[] args) {
    List<Integer> array = new ArrayList<>(Arrays.asList());
        MaxHeap heap = new MaxHeap(array);
        heap.display();
        System.out.println("---------------------");
        heap.insert(6);
        heap.insert(2);
        heap.insert(8);
        heap.insert(4);
        heap.insert(5);
        heap.insert(15);
        heap.remove();//remove first element means top elemwnt
       
        heap.display();
    }
}

