/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Stack;

/**
 *
 * @author nafees
 */
public class infixprofix {
    public static void  main(String[] args){
        String str="A+B-C";
        Stack<Character> stk=new Stack<>();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>=65 && ch[i]<91){
                System.out.print(ch[i]+" ");
            }
        else{
                if(ch[i]=='+' || ch[i]=='-' || ch[i]=='*' || ch[i]=='/'){
                    if(stk.empty()){
                        stk.push(ch[i]);
                    }else{
                    Character c=stk.pop();
                    System.out.print(c+" ");
                    stk.push(ch[i]);
                    }
                }
            }
        }
        
        System.out.print(stk.pop());
    }
}
