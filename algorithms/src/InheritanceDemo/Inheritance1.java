/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceDemo;

/**
 *
 * @author nafees
 */
public class Inheritance1 extends Thread{

    public final static void show() {
        System.out.println("show  parent Class");
    }
    public void run(){
        
    }

    Inheritance1() {

        System.out.println("parent Constructor Call");
    }

    public void display() {
        System.out.println("display parent Class");
    }

}

class child extends Inheritance1 {

    public void display() {
        System.out.println("display Child Class");
    }

    child() {
        System.out.println("Child Constructor Class");
    }
}

class SuperChild extends child {

    SuperChild() {
        super();
        System.out.println("superChild Constructor Class");
    }

    public void display() {
        System.out.println("display superChild Class");
    }
}

class M {

    public static void main(String[] args) {
        Inheritance1 c = new Inheritance1();
        c.show();
    }
}
