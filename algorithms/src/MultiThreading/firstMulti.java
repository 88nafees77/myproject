/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nafees
 */
public class firstMulti extends Thread {

    public void run() {

        try {
            FileReader fileReader = new FileReader("/home/nafees/Downloads/Checked.txt");
            BufferedReader br = new BufferedReader(fileReader);
            for (int i = 0; i < 1000; i++) {
                String str = br.readLine();
                if(str.equals("Nafees"))
           System.out.println("find");
           break;
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}

/*class second extends Thread{
   public void run(){
        for(int i=0;i<30;i++){
            System.out.println("second thread");
        }
    }
}*/
class MainDemo {

    public static void main(String... args) {
        firstMulti t = new firstMulti();
        //  second s= new second();
        t.start();
        //s.start();
        //for(int i=0;i<30;i++)System.out.println("main Thread");
    }
}
