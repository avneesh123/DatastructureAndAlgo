package graph;

import java.util.*;

public class UndirectedGraphHasPath {

    public static void main (String [] args){

        String [][] edges = {{"i","j"}, {"k", "i"}, {"m","k"}, {"k", "l"}, {"o", "n"}};

        // Set<String> visited = new HashSet<>();
        System.out.println(convertToAdjList(edges));

    }

    public static Map<String, List<String>> convertToAdjList(String [][] edges){
        Map<String, List<String>> graph = new HashMap<>();
        for(String[] edge : edges){
            if(!graph.containsKey(edge[0])){
                graph.put(edge[0], new ArrayList<>());
            }
            if(!graph.containsKey(edge[1])){
                graph.put(edge[1], new ArrayList<>());
            }
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }

}
