import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t!=0){
                int n=sc.nextInt();
                int arr[]=new int[n];
                 
                for(int i=0;i<n;i++)arr[i]=sc.nextInt();
                int aar1[]=new int[n];
                for(int i=0;i<n;i++)aar1[i]=sc.nextInt();
                ArrayList<Integer> list=new ArrayList<>();
                for(int i=0;i<n;i++){
                    list.add(arr[i]);
                }
                int flag=0;
                for(int i=0;i<n;i++){
                    if(!list.contains(aar1[i])){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println("1");
                }else
                    System.out.println("0");
                    t--;
            }
            
	}
}