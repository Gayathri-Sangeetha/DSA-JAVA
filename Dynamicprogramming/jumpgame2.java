package Dynamicprogramming;
import java.util.*;
public class jumpgame2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[]arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=sc.nextInt();
        }
        int[]dp=new int[m];
        for(int i=0;i<dp.length;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        //basecase
        dp[0]=0;
        for(int i=0;i<dp.length;i++){
            if(dp[i]!=Integer.MAX_VALUE){
                for(int j=1;j<=arr[i];j++){
                    if(i+j<dp.length){
                        dp[i+j]=Math.min(dp[i+j],dp[i]+1);
                    }
                }
            }
        }
        System.out.println(dp[dp.length-1]);
    }
}
