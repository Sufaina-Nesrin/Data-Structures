public class Array0 {

    //time and space complexity = 0(n2)T  0(1)S
    //To find the two numbers in the array to get the target value
    public static int[] twoNumberSum(int[] array,int target){
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length-1; j++){
                if(array[i]+array[j]==target){
                    return new int[]{array[i],array[j]};
                }
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
