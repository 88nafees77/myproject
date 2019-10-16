package algorithms;


public class Solution {
    public String[] fizzBuzz(int A) {
        String str[]=new String[A+1];
        for(int i=1;i<=A;i++){
            if(i%3==0){
                str[i]="Fizz";
                continue;
            }
            if(i%5==0){
                str[i]="Buzz";
                continue;
            }
            if(i%3==0 && i%5==0){
                str[i]="FuzzBuzz";
                continue;
            }
            if(i%3!=0 || i%5!=0){
                str[i]=Integer.toString(i);
                continue;
            }
        }
        return str;
    }
    public static void main(String[] args){
        Solution s=new Solution();
        String[] str=s.fizzBuzz(3);
        for(int i=1;i<str.length;i++)
        System.out.println(str[i]);
    }
}
