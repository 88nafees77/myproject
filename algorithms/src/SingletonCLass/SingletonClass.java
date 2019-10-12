/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonCLass;

/**
 *
 * @author nafees
 */
public class SingletonClass {

    int i;
    private static SingletonClass singletonClass = null;

    private SingletonClass() {
        System.out.println("singleton class");
    }

    public static SingletonClass getIns() {
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}


class M {

    public static void main(String... args) {
        SingletonClass singletonClass = SingletonClass.getIns();
        System.out.println(singletonClass);
        SingletonClass sing = SingletonClass.getIns();
        System.out.println(sing);

    }
}
