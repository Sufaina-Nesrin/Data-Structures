// import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph<T>{
    private Map<T, List<T>> map = new HashMap<>();
    private void addVertex(T data){
        map.put(data,new ArrayList<>());
    }

    public void insert(T vertex, T edge, boolean isBidirectional){
        if(!map.containsKey(vertex)){//to check whether it is there or not
                addVertex(vertex);
        }
        if(!map.containsKey(edge)){
                addVertex(edge);
        }

        map.get(vertex).add(edge);//to get a value of the key
        if(isBidirectional){
            map.get(edge).add(vertex);

        }
    }

    public void display(){
        for(T x: map.keySet()) {
            System.out.print(x+": ");
            for(T y:map.get(x)){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph<Character> graph = new Graph<Character>();
        graph.insert('3','5',true);
         graph.insert('3','4',true);
          graph.insert('5','6',true);

          graph.display();

    }
}