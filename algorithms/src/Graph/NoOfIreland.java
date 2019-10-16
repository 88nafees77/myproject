/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author nafees
 */
public class NoOfIreland {

    public static void main(String[] args) {
        NoOfIreland ireland = new NoOfIreland();
        int grid[][] = new int[][]{{1, 1, 0, 1}, {1, 1, 0, 1}, {0, 1, 0, 0}, {1, 0, 1, 0}};
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[0].length - 1; j++) {
                if (grid[i][i] != 0) {
                    ireland.Bfs(i, j, grid, visited);
                }

            }
        }
    }

    public void Bfs(int i, int j, int grid[][], boolean visited[][]) {
        if (i == grid.length - 1 || j == grid[0].length - 1) {
            return;
        }

        if (visited[i + 1][j] == false && grid[i + 1][j] == 1 && boundry(i + 1, j, grid, visited)) {
            visited[i + 1][j] = true;
            Bfs(i + 1, j, grid, visited);
        }
        if (visited[i][j + 1] == false && grid[i][j + 1] == 1 && boundry(i, j + 1, grid, visited)) {
            visited[i][j + 1] = true;
            Bfs(i, j + 1, grid, visited);
        }
        if (visited[i - 1][j] == false && grid[i - 1][j] == 1 && boundry(i - 1, j, grid, visited)) {
            visited[i - 1][j] = true;
            Bfs(i - 1, j, grid, visited);
        }
        if (visited[i][j - 1] == false && grid[i][j - 1] == 1 && boundry(i, j - 1, grid, visited)) {
            visited[i][j - 1] = true;
            Bfs(i, j - 1, grid, visited);
        }

    }

    public static boolean boundry(int i, int j, int grid[][], boolean visited[][]) {
        if (i > grid.length || j > grid[0].length || i < 0 || j < 0 || i > visited.length || j > visited[0].length || i < 0 || j < 0) {
            return false;
        }
        return true;
    }

}
