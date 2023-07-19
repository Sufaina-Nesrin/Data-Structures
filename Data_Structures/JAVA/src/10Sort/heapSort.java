import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class heapSort {

    List<Integer> heap = new ArrayList<>();
   public heapSort(){

   } 
    public heapSort(List<Integer> array){
      heap = array;
       buildHeap(heap);
    }

    public void buildHeap(List<Integer> array){
      int length = heap.size()-1;
    for(int i= parent(length); i >= 0; i--){
      heapify(length, i);

    
   }
    for(int i =length; i>0; i--){
      Collections.swap(heap, i, 0);
      heapify(i - 1, 0);
    }
    }

   private void heapify(int endIndx ,int currentIndx){
    
      int leftIndx = leftChild(currentIndx);
      
      while(leftIndx <= endIndx){
         int rightIndx = rightChild(currentIndx);
         int indxToshift;

         if(rightIndx <= endIndx && heap.get(rightIndx)>heap.get(leftIndx)){
            indxToshift = rightIndx;
         }else{
            indxToshift = leftIndx;
         }
         if(heap.get(indxToshift)>heap.get(currentIndx)){
            Collections.swap(heap, currentIndx, indxToshift);
            currentIndx = indxToshift;
         leftIndx = leftChild(currentIndx);
         }else{
            return;
         }

         
      }
      

   }

     
   public void display(){
      for(int i = 0; i < heap.size(); i++){
          System.out.println(heap.get(i));
      }
  }

     
    private void remove(){
        
    }

    private int parent(int i){
        return (i - 1) / 2;
    }

    private int leftChild(int i){
      return (i * 2) +1;
    }

    private int rightChild(int i){
      return (i * 2) +2;
    }

    public static void main(String[] args) {
      List<Integer> array = new ArrayList<>(Arrays.asList(6,2,8,4,5,15));
        heapSort heap = new heapSort(array);
        heap.display();  
    }
}
