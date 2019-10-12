/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nafees
 */
public class StringQus {
    public static void Freq(){
        String str="aaaabbbbccccaaa";
        List<Character> list=new ArrayList<>();
        int i=0,j=0;
        for(i=0;i<str.length();i++){
            while(str.charAt(i)==str.charAt(j++)){
                list.add(str.charAt(j));
            }
            System.out.print(list);
        }
       // System.out.print(list);
        
    }
    public static void main(String... args){
        StringQus.Freq();
    }
}

