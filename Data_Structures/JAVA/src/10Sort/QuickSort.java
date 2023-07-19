import java.util.Arrays;

public class QuickSort {
    

    public static int[] quickSort(int[] array){
        quickSortHelper(array, 0, array.length-1);
        return array;
    }


    public static void quickSortHelper(int[] array, int startIndx, int endIndx){
    // check the subarray or array contains one element
     if(startIndx>=endIndx){
      return;
     }
     int pivotIndx = startIndx;
     int leftIndx = startIndx + 1;
     int rightIndx = endIndx;

     while(leftIndx <= rightIndx){
        //both sides are in wrong position
        if(array[leftIndx] > array[pivotIndx] && array[rightIndx]< array[pivotIndx]){
           swap(array,leftIndx, rightIndx);
           leftIndx++;
           rightIndx--;
        }
        if(array[leftIndx] <= array[pivotIndx]){
            leftIndx++;
        }
        if(array[rightIndx] >= array[pivotIndx]){
            rightIndx--;
        }
     }
     swap(array, rightIndx,pivotIndx);
     //call the left subarray to the quickSort function
     //then right sub array 
     quickSortHelper(array,startIndx, rightIndx-1);//leftSubArray
     quickSortHelper(array,rightIndx+1, endIndx);//leftSubArray
     
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {30, 2, 41, 56, 12, 11, 22};
        int[] result = quickSort(array);
        Arrays.stream(result).forEach(x ->System.out.println(x));
    }
    
}
