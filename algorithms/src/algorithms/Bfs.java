/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author nafees
 */
public class Bfs {
    public int BfS(int x,int y,int t1,int t2,int n){
        int level=0;
        Queue<Integer []> queue=new LinkedList<>();
        queue.add(new Integer[]{x,y});
        while(!queue.isEmpty()){
            level++;
            Integer integer[]=queue.poll();
            int l=integer[0];
            int r=integer[1];
            if(l==t1 && r==t2){
                return level;
            }
            if(isBoundry(l, r+1, n)){
                queue.add(new Integer[]{l,r+1});
            }
            if(isBoundry(l-1, r, n)){
                queue.add(new Integer[]{l-1,r});
            }
            if(isBoundry(l+1, r, n)){
                queue.add(new Integer[]{l,r+1});
            }
            if(isBoundry(l, r-1, n)){
                queue.add(new Integer[]{l,r+1});
            }
            
        }
        return -1;
        
        
    }
    public boolean isBoundry(int x,int y,int n){
        if(x<0 || y<0 || x>n || y>n)return false;
        return true;
    }
    public static void main(String... args){
        Bfs b=new Bfs();
        System.out.println(b.BfS(0, 0, 2, 1, 3));
    }
}
