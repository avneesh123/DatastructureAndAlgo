package graph;

import java.util.*;

public class GraphTraversal {

    public static void main (String [] args){

        Map<String, List<String>> graph = new HashMap<>();
        graph.put("a", Arrays.asList("b", "c"));
        graph.put("b", Arrays.asList("d"));
        graph.put("c", Arrays.asList("e"));
        graph.put("d", Arrays.asList("f"));
        graph.put("e", new ArrayList<>());
        graph.put("f", new ArrayList<>());

       // printDfsRecursively(graph,"a");
        printBfs(graph,"a");
    }

    public static void printDfsRecursively (Map<String, List<String>> graph, String source){
        System.out.println("source --- " + source);
        List<String> neighbors =  graph.get(source);
        for (String neighbor: neighbors) {
            printDfsRecursively(graph, neighbor);
        }
    }

    public static void printBfs (Map<String, List<String>> graph, String source){
        LinkedList<String> queue = new LinkedList<>();
        queue.add(source);
        while(queue.size() > 0){
            String current = queue.poll();
            System.out.print(" " + current + " " );
            List<String> neighbors =  graph.get(current);
            for (String neighbor: neighbors) {
                queue.add(neighbor);
            }
        }
    }

}
