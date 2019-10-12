/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author nafees
 */
public class JoinDemo implements Runnable {

    int val = 0;

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(val+i);
            val = val + i;
        }
    }
}

class JoinDemoMain {

    public static void main(String[] args) throws InterruptedException {
        JoinDemo demo = new JoinDemo();
        Thread t = new Thread(demo);
        t.start();
        //t.join();
        for (int i = 0; i < 50; i++) {
        //    System.out.println(demo.val);
           // demo.val = demo.val + i;
        }
        
    }
}
