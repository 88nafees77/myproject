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
public class YieldDemo extends Thread {

    public void run() {
        for (int i = 0; i < 50; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " " + Thread.currentThread().getState());
                

            }

        }
    }
}

class M {

    public static void main(String[] args) {
        YieldDemo demo = new YieldDemo();
        
        demo.start();
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " " + Thread.currentThread().getState());
                
            }
        }
    }
}
