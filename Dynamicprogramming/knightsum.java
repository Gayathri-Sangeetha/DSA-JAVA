package Dynamicprogramming;
public class knightsum{
	public static void main(String[] args) {
	int startro=0;
	int startco=0;
	int endrow=7;
	int endcol=7;
	int[][]dp=new int[8][8];
	for(int i=0;i<dp.length;i++){
	    for(int j=0;j<dp.length;j++){
	        dp[i][j]=Integer.MAX_VALUE;
	    }
	}
	int[]dx={2,2,-2,-2,1,1,-1,-1};
	int[]dy={1,-1,1,-1,2,-2,2,-2};
	//basecase for dp:
	dp[startro][startco]=0;
	boolean changes=true;
	while(changes){
	    changes=false;
	for(int startrow=0;startrow<dp.length;startrow++){
	    for(int startcol=0;startcol<dp.length;startcol++){
	        if(dp[startrow][startcol]!=Integer.MAX_VALUE){
	            for(int i=0;i<dx.length;i++){
	                int nextrow=startrow+dx[i];
	                int nextcol=startcol+dy[i];
	               if(nextrow<8&&nextrow>=0&&nextcol<8&&nextcol>=0){
					if(dp[nextrow][nextcol]>dp[startrow][startcol]+1){
						dp[nextrow][nextcol]=dp[startrow][startcol]+1;
                              changes=true;
					}
	               }
	                }
	        }
	}}}
	    System.out.println(dp[endrow][endcol]);}}
