import java.util.Arrays;

public class selectionSort {
    


        public static int[] selectionSort(int[] array){
            int size = array.length -1;
            for(int i = 0; i<=size; i++){
                int minIndx = i;

                for(int j=i+1; j<=size; j++){
                    if(array[j] < array[minIndx]){
                        minIndx = j;
                    }
                      }
                    //swap
                    int temp = array[i];
                    array[i] = array[minIndx];
                    array[minIndx] = temp;
              
            }
            return array;
        }
    
    public static void main(String[] args) {
        int[] array = {30, 2, 41, 56, 12, 11, 22};
        int[] result = selectionSort(array);
        Arrays.stream(result).forEach(x ->System.out.println(x)); 
    }
}
