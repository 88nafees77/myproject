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
public class ThreadLearn implements Runnable {

    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
           // System.out.print(Thread.currentThread().getName());
            System.out.println("child" + i);
        }
    }

    public void run(int i) {
        System.out.println(i);
    }

}

class MDemo {

    public static void main(String[] args) {
        ThreadLearn tl = new ThreadLearn();
        Thread t = new Thread(tl);
     //   System.out.println(Thread.currentThread().getName());
       // tl.run(5);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("parent");
        }
    }
}
