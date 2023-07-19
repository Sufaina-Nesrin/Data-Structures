import java.util.Set;
import java.util.HashSet;
public class Array1 {

//time and space complexity = 0(n)TS
     public static int[] twoNumberSum(int[] array,int target){

       Set<Integer> nums = new HashSet<>(); 
         for(int i=0; i<array.length; i++){
            int num = array[i];
            int match = target-num;
            if(nums.contains(match)){
                return new int[]{num, match};
            }else{
              nums.add(num);
            }
         }
        return new int[0];
    }


    public static void main(String[] args) throws Exception {

         int[] array = {6,5,7,9,4,0,2};
         int[] result = twoNumberSum(array, 10);
         System.out.println("first:"+result[0]+"second:"+result[1]);
    }
    
}
