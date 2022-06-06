package graph;

import java.util.*;

public class HasPath {

    public static void main (String [] args){

        Map<String, List<String>> graph = new HashMap<>();
        graph.put("f", Arrays.asList("g", "i"));
        graph.put("g", Arrays.asList("h"));
        graph.put("i", Arrays.asList("g", "k"));
        graph.put("j", Arrays.asList("i"));
        graph.put("h", new ArrayList<>());
        graph.put("k", new ArrayList<>());

       // Set<String> visited = new HashSet<>();
      System.out.println(hasPath(graph, "f", "k"));

    }

    public static boolean hasPath (Map<String, List<String>> graph, String source, String dest){
        if(source.equalsIgnoreCase(dest)) return true;

        List<String> neighbors =  graph.get(source);
        for (String neighbor: neighbors) {
            if (hasPath(graph, neighbor, dest )) return true;
        }
        return false;
    }
}
