public class Array2 {
    
     public static int[] twoNumberSum(int[] array,int target){
        int i = 0;
        int j = array.length-1;
        int temp;
       
           while(i<j){
        while(i<j && array[j]==target){
            j--;
        }
        if(array[i]==target && array[j]!=target){
          temp = array[i];
          array[i] = array[j];
          array[j] = temp; 
          j--;
        }
        i++;
       }
       return array;
}
      
    public static void main(String[] args) {
        int[] arr = {6,1,8,10,4,15,6,3,9,6};
        int[] result = twoNumberSum(arr, 6);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
// Here what we have done is :
//we input an array and a target from the user then, we have to print all the 
//targeted number in last positions of the array;

