package graph;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a function, islandCount, that takes in a grid containing Ws and Ls. W represents water and L represents land.
 * The function should return the number of islands on the grid. An island is a vertically or horizontally connected region of land.
 */
public class MinIsland {
    
    
    public static void main (String [] args) {
        String[][] grid = {
                {"W", "W", "W", "W", "W"},
                {"W", "L", "W", "W", "W"},
                {"W", "W", "W", "L", "W"},
                {"W", "W", "L", "L", "W"},
                {"L", "W", "W", "L", "L"},
                {"L", "L", "W", "W", "W"},
        };
        Set<String> visited = new HashSet<>();
        int count = Integer.MAX_VALUE;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                int tempCount = explore(r, c, grid, visited);
                        if(tempCount != 0)  count = Math.min ( tempCount, count);
            }
        }
        System.out.println("Min Island Count is : " + count);
    }

    public static int explore(int row, int col, String[][]grid, Set<String> visited){

        boolean rowBound =   0<=row && row<grid.length;
        boolean colBound =   0<=col && col<grid[0].length;

        if(!rowBound || !colBound) return 0;
        if(grid[row][col].equalsIgnoreCase("W")) return 0;

        String pos = row + "," + col;
        if(visited.contains(pos)) return 0;
        visited.add(pos);
        int count=1;
        count += explore( row+1, col, grid, visited);
        count += explore( row-1, col, grid, visited);
        count += explore( row, col+1, grid, visited);
        count += explore( row, col-1, grid, visited);
        System.out.println("Returning Count is : " + count);
        return count;
    }

}
