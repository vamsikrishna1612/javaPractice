package streams;

import java.util.ArrayList;

public class Dependencies {


  static boolean cycle(ArrayList<ArrayList<Integer>> graph, int index, boolean onPath[], boolean visited[]){
    if(visited[index]) return false;
    visited[index]=true;
    onPath[index]= true ;
    for(int i: graph.get(index))
      if(onPath[i] || cycle(graph, i, onPath, visited))
        return true;
    return onPath[index]=false;
  }



  public boolean canBeResolved(int numDependecies, int[][] prerequisites) {
    int length= prerequisites.length, rowLength=prerequisites[0].length;
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>(numDependecies);
    for(int i=0; i<numDependecies; i++){
      graph.add(new ArrayList<Integer>());
    }
    for( int i=0; i<length; i++)
        graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        boolean onPath[] =  new boolean[numDependecies];
        boolean visited[] = new boolean[numDependecies];
        for(int i=0; i<numDependecies; i++) {
          if(!visited[i] && cycle(graph, i, onPath, visited)) System.out.println("false");
        }
    System.out.println("true");
    return true;
  }



  public static void main(String[] args){
    int num = 2;
//    boolean check = canBeResolved(num, );
  }


}
