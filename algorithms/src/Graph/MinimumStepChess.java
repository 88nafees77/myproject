/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author nafees
 */
public class MinimumStepChess {

    public int chessStep(int i, int j, int grid[][]) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{0, 0});

        int level = 1;

        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            for (int l = 1; l <= size; l++) {
                Integer tmp[] = queue.poll();
                int a = tmp[0];
                int b = tmp[1];
                if (a == i && b == j) {
                    return level;
                }
                if (boundry(a + 1, b, grid)) {
                    if ((a + 1) == i && b == j) {
                        return level;
                    }
                    queue.add(new Integer[]{a + 1, b});

                }
                if (boundry(a, b + 1, grid)) {
                    if (a == i && (b + 1) == j) {
                        return level;
                    }
                    queue.add(new Integer[]{a, b + 1});
                }
                if (boundry(a - 1, b, grid)) {
                    if ((a - 1) == i && b == j) {
                        return level;
                    }
                    queue.add(new Integer[]{a - 1, b});
                }
                if (boundry(a, b - 1, grid)) {
                    if (a == i && (b - 1) == j) {
                        return level;
                    }
                    queue.add(new Integer[]{a, b - 1});

                }

                if (boundry(a + 1, b + 1, grid)) {
                    if ((a + 1) == i && (b + 1) == j) {
                        return level;
                    }
                    queue.add(new Integer[]{a + 1, b + 1});

                }
                if (boundry(a + 1, b - 1, grid)) {
                    if ((a + 1) == i && (b - 1) == j) {
                        return level;
                    }
                    queue.add(new Integer[]{a + 1, b - 1});
                }
                if (boundry(a - 1, b - 1, grid)) {
                    if ((a - 1) == i && (b - 1) == j) {
                        return level;
                    }
                    queue.add(new Integer[]{a - 1, b - 1});
                }
                if (boundry(a - 1, b + 1, grid)) {
                    if ((a - 1) == i && (b + 1) == j) {
                        return level;
                    }
                    queue.add(new Integer[]{a - 1, b + 1});
                }
            }
        }
        return -1;
    }

    public boolean boundry(int i, int j, int grid[][]) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MinimumStepChess chess = new MinimumStepChess();
        int[][] grid = new int[4][4];
        System.out.println(chess.chessStep(2, 1, grid));
    }
}
