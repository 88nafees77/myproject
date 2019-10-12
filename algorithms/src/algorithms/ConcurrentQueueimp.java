/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author nafees
 */
public class ConcurrentQueueimp {
    
   static int front=-1,rear=-1;
   static int queue[]=new int[100];
    public static void main(String... aargs) {
        ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue();
        clq.add(1);
        clq.add(2);
        clq.add(3);
       
        Integer i=clq.poll();
        push(i);
        Integer j=clq.poll();
        push(j);
        Integer k=clq.poll();
        push(k);
        System.out.print(pop());
        System.out.print(pop());
        System.out.print(pop());
        
        
       
    }
     public static void push(Integer val){
            queue[++rear]=val;
            front=0;
                                                                          
     }
     public static int pop(){
         return queue[rear--];
     }
}
