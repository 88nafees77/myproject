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
public class ByRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child Thread");
        }
    }

}

class SecondThread extends ByRunnable implements Runnable{

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("second Thread");
        }
    }
}

class ThreadDemo {

    public static void main(String... args) {
        ByRunnable br = new ByRunnable();
        Thread thread = new Thread(br);
        thread.start();
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Secondparent Thread"+i);
        }
        ;
        
    }
}
