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
public class InheritanceDemo2 {
     void display(){
        System.out.println("parent");
    }
}
class A extends InheritanceDemo2{
     void display(){
         System.out.println("child");
    }
    public static void main(String[] args){
        InheritanceDemo2 demo2=new A();
        demo2.display();
    }
}

