/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author nafees
 */
public class ImplementGraph {

    LinkedList<Integer> adj[];

    public void createGraph(int V) {
        adj=new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void addEdge(int s, int d) {
        adj[s].add(d);
    }
    public void bfs(int s){
        boolean visited[]=new boolean[7];
        visited[s]=true;
        Queue<Integer> q=new LinkedList();
        q.add(s);
        while(!q.isEmpty()){
            s=q.poll();
            System.out.println(s+" ");
            Iterator it=adj[s].listIterator();
            while(it.hasNext()){
                Integer val=(Integer) it.next();
                if(!visited[val]){
                System.out.println(val);
                q.add(val);
                visited[val]=true;
                }
            }
            
        }
    }

}

class M {

    public static void main(String[] args) {
        ImplementGraph graph = new ImplementGraph();
        graph.createGraph(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of edges");
        int edg = sc.nextInt();
        for (int i = 0; i < edg; i++) {
            System.out.println("Enter Source And Destination");
            int s = sc.nextInt();
            int d = sc.nextInt();
            graph.addEdge(s, d);
        }
        graph.bfs(1);

    }
}
