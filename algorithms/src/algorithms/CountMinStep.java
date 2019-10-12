package algorithms;


import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nafees
 */
public class CountMinStep {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(1);
        int level = 0;
        while (!queue.isEmpty()) {

            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                Integer val = queue.poll();
                if (val == 30) {
                    System.out.println(level);
                    return;
                }
                queue.add(val + 1);
                queue.add(val * 2);
            }
            level++;
        }
    }
}
