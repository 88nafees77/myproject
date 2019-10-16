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
public class StringMatch {
    public static void main(String[] args){
        Stack<Character> stack=new Stack();
        String str="abcxycabcgababc";
        String m="xy";
        for(int i=str.length()-1;i>=0;i--){
            stack.push(str.charAt(i));
        }
        int count=0;
        while(!stack.empty()){
            int i=0;
            for(i=0;i<m.length();i++){
                Character ch=stack.pop();
                if(ch==m.charAt(i))continue;
                else{
                    break;
                }
            }
            if(i==m.length()){
                count++;
            }
        }
        System.out.println(count);
    }
}
