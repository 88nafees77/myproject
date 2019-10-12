/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author nafees
 */
public class queueusingstack {
    Stack<Integer> stk1=new Stack();
    Stack<Integer> stk2=new Stack();
    public void enque(int val){
        stk1.push(val);
    }
    public int dequeue(){
        while(!stk1.empty()){
            Integer i=stk1.pop();
            stk2.push(i);
        }
        return stk2.pop();
    }
    public static void main(String... arg){
        queueusingstack que=new queueusingstack();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int val=sc.nextInt();
            que.enque(val);
        }
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        System.out.println(que.dequeue());
        que.enque(9);
        System.out.println(que.dequeue());
        
    }
}
