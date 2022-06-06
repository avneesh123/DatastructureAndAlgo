package graph;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a function, islandCount, that takes in a grid containing Ws and Ls. W represents water and L represents land.
 * The function should return the number of islands on the grid. An island is a vertically or horizontally connected region of land.
 */
public class IslandCount {
    
    
    public static void main (String [] args) {
        String[][] grid = {
                {"W", "L", "W", "W", "W"},
                {"W", "L", "W", "W", "W"},
                {"W", "W", "W", "L", "W"},
                {"W", "W", "L", "L", "W"},
                {"L", "W", "W", "L", "L"},
                {"L", "L", "W", "W", "W"},
        };
        Set<String> visited = new HashSet<>();
        int count =0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
              if(explore(r, c, grid, visited)) count +=1;
            }
        }
        System.out.println("Island Count is - " + count);
    }

    public static boolean explore(int row, int col, String[][]grid, Set<String> visited){

        boolean rowBound =   0<=row && row<grid.length;
        boolean colBound =   0<=col && col<grid[0].length;

        if(!rowBound || !colBound) return false;
        if(grid[row][col].equalsIgnoreCase("W")) return false;

        String pos = row + "," + col;
        if(visited.contains(pos)) return false;
        visited.add(pos);

        explore( row+1, col, grid, visited);
        explore( row-1, col, grid, visited);
        explore( row, col+1, grid, visited);
        explore( row, col-1, grid, visited);

        return true;
    }

}
