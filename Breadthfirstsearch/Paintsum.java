package Breadthfirstsearch;
import java.util.*;
public class Paintsum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[][]arr=new int[5][6];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[]dx={1,-1,0,0,1,-1,-1,1};
        int[]dy={0,0,1,-1,1,1,-1,-1};
        int startrow=1;
        int startcol=1;
        if(arr[startrow][startcol]==1){
            System.out.println("0");
            return;
        }
        Queue<Pair>que=new LinkedList<>();

        arr[startrow][startcol]=2;
        boolean[][]vis=new boolean[5][6];
        que.add(new Pair(startrow,startcol));
        vis[startrow][startcol]=true;
        while(!que.isEmpty()){
            Pair p=que.poll();
        for(int i=0;i<dx.length;i++){
               int row=p.row;
               int col=p.col;
               int nextrow=row+dx[i];
               int nextcol=col+dy[i];
               if(nextrow>=0&&nextrow<arr.length&&nextcol>=0&&nextcol<arr[0].length&&
                arr[nextrow][nextcol]==0&&!vis[nextrow][nextcol])
               {
                que.add(new Pair(nextrow,nextcol));
                vis[nextrow][nextcol]=true;
                arr[nextrow][nextcol]=2;
               }

        }    
    }
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]);
            if(arr[i][j]==2){
                count++;
            }
        }
        System.out.println();
    }

    System.out.println(count);
    }
}
 class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
