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
public class SynchronizedDemo {

    public synchronized void odd() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "");
            }
        }
    }

    public synchronized void even() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "");
            }
        }
    }
}
class MyThread extends Thread{
    SynchronizedDemo d;
    public MyThread(SynchronizedDemo d) {
        this.d=d;
    }
    
    public void run(){
        d.odd();
    }
}
class MyThread2 extends Thread{
    SynchronizedDemo d;
    public MyThread2(SynchronizedDemo d) {
        this.d=d;
    }
    
    public void run(){
        d.even();
    }
}
class MAIN{
    public static void main(String[] args){
        SynchronizedDemo d=new SynchronizedDemo();
        MyThread mt=new MyThread(d);
        MyThread2 mt1=new MyThread2(d);
        mt.start();
        mt1.start();
    }
}
