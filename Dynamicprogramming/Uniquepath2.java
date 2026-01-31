package Dynamicprogramming;
import java.util.*;
public class Uniquepath2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][]grid=new int[m][n];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        int[][]dp=new int[m][n];
        if(grid[0][0]==1){
            System.out.println("0");
            return;
        }
        dp[0][0]=1;
        for(int i=1;i<dp[0].length;i++){
            if(grid[0][i]==0&&dp[0][i-1]==1){
                dp[0][i]=1;
            }
        }
        
        for(int i=1;i<dp.length;i++){
            if(grid[i][0]==0&&dp[i-1][0]==1){
                dp[i][0]=1;
            }
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(grid[i][j]==0){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        System.out.println(dp[dp.length-1][dp[0].length-1]);

    }
}
