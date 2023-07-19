public class AlgoBinarySearch {
    public static int BinarySearch(int[] array,int target){
        int startIndx = 0;
        int endIndx = array.length-1;
        while(startIndx <= endIndx){
          int middle = startIndx + (endIndx-startIndx)/2;
          if(array[middle] == target){
            return middle;
          }else if(array[middle] > target){
            endIndx = middle - 1;
          }else if(array[middle] < target){
            startIndx = middle + 1;
          }
        }

        return -1;
    }
public static int binaryRec(int[] array, int target){
   return binaryRecHelper(array, target, 0, array.length-1);

}
public static int binaryRecHelper(int[] array, int target,int startIndx,int endIndx){
     if(startIndx > endIndx){
        return -1;
     }
     int middle = startIndx +(endIndx-startIndx)/2;
     if(array[middle] == target){
        return middle;
     }else if(array[middle] > target){
            return binaryRecHelper(array, target, startIndx, middle-1);
          }else {
            return binaryRecHelper(array, target, startIndx+1, middle);
          }
}

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        //System.out.println(BinarySearch(array, 1));
        System.out.println(binaryRec(array, 2));
    }

}
