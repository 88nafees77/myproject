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
public class infixbracket {

    public static void main(String... args) {
        String str = "((A+B)-C)+D";
        Stack<Character> stk = new Stack<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] < 91) {
                System.out.print(ch[i] + " ");
            }else{
                if(ch[i]=='+' || ch[i]=='-' || ch[i]=='(' || ch[i]==')'){
                    stk.push(ch[i]);
                }else{
                    //stk.push(ch[i]);
                    while(stk.pop()!=')'){
                        while(!stk.empty()){
                            Character c=stk.pop();
                            if(c=='+' ||c=='-'){
                                 System.out.print(c + " ");
                            }
                        }
                    }
                }
            }
        }
        char s=str.charAt(0);
       
    }
}
