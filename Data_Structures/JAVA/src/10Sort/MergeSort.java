import java.util.Arrays;

public class MergeSort {
    

    public static int[] mergeSort(int[] array){
        if(array.length <= 1){
            return array;
        }
        int middleIdx = array.length/2;
        int [] firstHalf = Arrays.copyOfRange(array, 0, middleIdx);
        int [] lastHalf = Arrays.copyOfRange(array, middleIdx, array.length);
       
return join(mergeSort(firstHalf), mergeSort(lastHalf));
    }

    private static int[] join(int[] firstHalf, int[] lastHalf){
        //lngth of new array
        int [] newArray = new int[firstHalf.length+ lastHalf.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i <firstHalf.length && j<lastHalf.length){
            if(firstHalf[i]<lastHalf[j]){
                newArray[k++] = firstHalf[i++];
                //post increment uses :first assign and then increment
                //preIncrenent :first increment and then assign
                // k++;
                // i++;
            }else{
                newArray[k++] = lastHalf[j++];
               
            }
        }
        //not   (n^2)  nested loop so n+n but it also less than that when we comes to the reality
        while(i < firstHalf.length){
            newArray[k++] = firstHalf[i++];
        }
        while(j < lastHalf.length){
            newArray[k++] = lastHalf[j++];
        }
      return newArray; 
    }
    public static void main(String[] args) {
        int [] array = {6,2,8,4,5,15};
        int [] result = mergeSort(array);
        Arrays.stream(result).forEach(x -> System.out.println(x));
    }
}
