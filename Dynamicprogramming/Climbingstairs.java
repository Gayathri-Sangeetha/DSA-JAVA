package Dynamicprogramming;

public class Climbingstairs {
    public static void main(String[]args){
        int step=5;
        int[]dp=new int[step+1];
        //base-case
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.print(dp[4]);
    }
}
