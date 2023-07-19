import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class MinHeap {
   List<Integer> heap = new ArrayList<>();

    public MinHeap(){

    }

    public MinHeap(List<Integer>array){
       buildHeap(array);
    }

    public void buildHeap(List<Integer> array){
        heap = array;
        //last child position
        //parent(last child) = last parent
        for(int i = parent(heap.size()-1); i>=0; i--){
          shiftDown(i);//i = last parent
        }
    }

    private void shiftDown(int currentIndx){
        //size of index -1 = last index
           int endIndex = heap.size() - 1;
           int leftIndx = leftChild(currentIndx);

        while(leftIndx <= endIndex){
            int rightIndx = rightChild(currentIndx);
            int indxToShift;
            if(rightIndx <= endIndex && heap.get(rightIndx)< heap.get(leftIndx)){
                indxToShift = rightIndx;
            }else{
                indxToShift = leftIndx;
            }
            if(heap.get(currentIndx) >heap.get(indxToShift)){
                Collections.swap(heap, currentIndx, indxToShift);
                currentIndx = indxToShift;
                //check it has child
                leftIndx = leftChild(currentIndx);
            }else{
              return;
            }
        }

    }

    private void shiftUp(int currentIndx){
         int parentIndx = parent(currentIndx);
         while(currentIndx > 0 && heap.get(parentIndx) > heap.get(currentIndx)){
            Collections.swap(heap, currentIndx, parentIndx);
            currentIndx = parentIndx;
            parentIndx = parent(currentIndx);
         }
    }

    public int peak(){

      return heap.get(0); 
    }

    public void remove(){
      Collections.swap(heap, 0, heap.size()-1);
      heap.remove(heap.size()-1);
      shiftDown(0);
     }

    public void insert(int value){
      heap.add(value);
      shiftUp(heap.size()-1);
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
        List<Integer> array = new ArrayList<>(Arrays.asList(6,2,8));
        MinHeap heap = new MinHeap(array);
        heap.display();
        System.out.println("---------------------");
        heap.insert(4);
        heap.insert(5);
        heap.insert(15);
        heap.insert(4);
        heap.display();
    }
}
