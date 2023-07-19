import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class RiverGraph {
    public List<Integer> checkRiverSize(int[][] matrix){
      //creating new array to check whether the elements visited or not
      //by adding boolean values
      //matrix[0].length means size of columns
      //static array
      boolean[][] visted = new boolean[matrix.length][matrix[0].length];//row and column
      List<Integer> sizes = new ArrayList<>();//dynamic array
      for (int i= 0; i<matrix.length; i++){
        for(int j= 0; j<matrix[0].length; j++){
          if(visted[i][j]){
               continue;
          }else{
             traverseThroughRiver(i, j, matrix, visted, sizes);
          }
        }
        
      }
return sizes;

    }

   public void traverseThroughRiver(int i, int j, int[][] matrix, boolean[][] visted,List<Integer> sizes){
    int currentRiver = 0;
  Stack<Integer[]> nodesToExplore = new Stack<>();
  nodesToExplore.add(new Integer[]{i,j});
  while(!nodesToExplore.empty()){
    Integer[] currentNode = nodesToExplore.pop();
    i = currentNode[0];
    j = currentNode[1];

    if(visted[i][j]){
         continue;
      }
        visted[i][j] = true;
        if(matrix[i][j] == 0){
          continue;
        }
          currentRiver++;
          List<Integer[]> nearest = getNearestNodes(i, j, matrix, visted);
          //add the list into the stack
          nodesToExplore.addAll(nearest);

  }
  sizes.add(currentRiver);
  } 
  //return a list contains array of elements position like{[1,2], [1,1]}
  private List<Integer[]> getNearestNodes(int i, int j, int[][] matrix, boolean[][] visited){
    List<Integer[]> nearest = new ArrayList<>();
    if(i>0 && !visited[i-1][j]){//to add top of that element
    nearest.add(new Integer[] {i-1, j});
    }
    if(i<matrix.length-1 && !visited[i+1][j]){// to add bottom
    nearest.add(new Integer[] {i+1, j});
    }
    if(j>0 && !visited[i][j-1]){//to add left
    nearest.add(new Integer[] {i, j-1});
    }
    if(i<matrix[0].length && !visited[i][j+1]){// to add right
    nearest.add(new Integer[] {i, j+1});
    }
 return nearest;
  }
}
