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
public class SubString {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        String str="abc";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
              list.add(str.substring(i, j));
            }
        }
        System.out.println(list);
       
    }
}
