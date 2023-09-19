import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Graph {
    private static class Vertex{
        //neighbors of a vertex stored in HashMap "ngbrs"
        HashMap<String, Integer> ngbrs = new HashMap<>();
    }

    private HashMap<String, Vertex> vertices = new HashMap<>(); // HashMap to store vertices

    //method to add vertex in Graph
    public void addVertex(String vname){
        Vertex vtx = new Vertex();
        vertices.put(vname,vtx);
    }

    // method to add an edge in Graph
    public void addEdge(String vname1, String vname2, int cost){
        Vertex vtx1 = vertices.get(vname1);
        Vertex vtx2 = vertices.get(vname2);
        //if one of the node is null or nodes are already connected
        if(vtx1 == null || vtx2 == null || vtx1.ngbrs.containsKey(vname2)){
            return;
        }

        vtx1.ngbrs.put(vname2,cost);
        vtx2.ngbrs.put(vname1,cost);
    }

    //Number of vertex in a Graph
    public int numVertex(){
        return vertices.size();
    }

    //method to remove a vertex
    public void removeVertex(String v_name){
        //Node is not present in the Graph
        if(!vertices.containsKey(v_name)) return;

        vertices.remove(v_name);

        ArrayList<String> keys = new ArrayList<>(vertices.keySet());

        for(String key : keys){
            Vertex vtx = vertices.get(key);
            if(!vtx.ngbrs.containsKey(v_name)){
                continue;
            }
            vtx.ngbrs.remove(v_name);// remove the node present in map ngbrs of other nodes
        }
    }

    //method to remove an edge
    public void removeEdge(String v_name1, String v_name2){
        Vertex vtx1 = vertices.get(v_name1);
        Vertex vtx2 = vertices.get(v_name2);

        // when either one or both node might not be present in the graph
        if(!vertices.containsKey(v_name1) || !vertices.containsKey(v_name2) ){
            return;
        }

        vtx1.ngbrs.remove(v_name2);
        vtx2.ngbrs.remove(v_name1);
    }

    // method to display Graph
    public void displayGraph(){
       // arrayList to store the nodes of a graph
       ArrayList<String> keys = new ArrayList<>(vertices.keySet());

       for(String key : keys){
           Vertex vtx = vertices.get(key);
           String str = key + "->" + vtx.ngbrs;
           System.out.println(str);
       }
       System.out.println("=======================================");
    }
    
}
