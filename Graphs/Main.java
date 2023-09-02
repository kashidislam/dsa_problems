// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello! Welcome to Graph Data Structure");
        System.out.println("=======================================");

        Graph g = new Graph();

        g.addVertex("Delhi");
        g.addVertex("Mumbai");
        g.addVertex("Kolkata");
        g.addVertex("Guwahati");
        g.addVertex("Hyderabad");
        g.addVertex("Bengaluru");
        g.addVertex("Cochin");
        g.addVertex("Chennai");

        g.addEdge("Delhi", "Mumbai",6);
        g.addEdge("Delhi", "Kolkata",8);
        g.addEdge("Delhi", "Hyderabad",7);
        g.addEdge("Kolkata", "Guwahati",5);
        g.addEdge("Mumbai", "Bengaluru",4);
        g.addEdge("Bengaluru", "Hyderabad",3);
        g.addEdge("Bengaluru", "Cochin",1);
        g.addEdge("Bengaluru", "Chennai",2);

        g.displayGraph();
        g.removeEdge("Delhi","Hyderabad");
        System.out.println("Graph after the edge is removed between Delhi and Hyderabad");
        g.displayGraph();

        g.removeVertex("Hyderabad");
        System.out.println("Graph after the vertex Hyderabad is removed");
        g.displayGraph();


    }
}