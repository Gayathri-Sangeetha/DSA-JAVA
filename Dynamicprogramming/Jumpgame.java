package Dynamicprogramming;
import java.util.*;
public class Jumpgame {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
int[]arr=new int[m];
for(int i=0;i<m;i++){
    arr[i]=sc.nextInt();
}
boolean[]dp=new boolean[arr.length];
dp[0]=true;//basecase
for(int i=0;i<dp.length;i++){
if(dp[i]==true){
    for(int j=0;j<=arr[i];j++){
        if(i+j<dp.length){
            dp[i+j]=true;
        }
    }
}
}
System.out.println(dp[dp.length-1]);

    }
}
