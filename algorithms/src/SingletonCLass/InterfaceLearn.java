/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafees
 */
abstract class InterfaceLearn {
    abstract void sum();
     void sum(int a){
         
     }
    
}
class I extends InterfaceLearn{
    public void sum(){
        System.out.println("sum");
    }
}
class m{
    public static void main(String... args){
        I i=new I();
        i.sum();
    }
}
