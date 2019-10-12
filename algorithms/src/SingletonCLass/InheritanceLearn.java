/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package SingletonCLass;

/**
 *
 * @author nafees
 */
public class InheritanceLearn {
    int i;
   void show(int a){
       i=a;
        System.out.println("Show"+i);
    }
   
  
}
class child extends InheritanceLearn{
    public void showP(){
        super.show(5);
         
        System.out.println("ShowP"+super.i);
    }
}
class son extends child{
    public void s(){
        super.showP();
    }
}
class M {

    public static void main(String... args) {
        child c=new child();
        c.showP();
        

    }
}

