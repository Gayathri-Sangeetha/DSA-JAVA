package Graphs;
import java.util.*;
public class Islands {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int count=0;
        char[][]arr=new char[m][n];
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        arr[i][j]=sc.next().charAt(0);//adding 0s and 1s alone
    }
}
int[]dx={-1,1,0,0};
int[]dy={0,0,-1,1};
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(arr[i][j]=='1'){
            dfstraversal(i,j,dx,dy,arr);
            count++;
        }
    }
}
System.out.println(count);
}
public static void dfstraversal(int startrow,int startcol,int[]dx,int[]dy,char[][]arr){
    arr[startrow][startcol]='2';
    for(int i=0;i<dx.length;i++){
        int nextrow=startrow+dx[i];
        int nextcol=startcol+dy[i];
        if(nextrow>=0&&nextcol>=0&&nextrow<arr.length&&nextcol<arr[0].length&&arr[nextrow][nextcol]=='1'){
            dfstraversal(nextrow,nextcol,dx,dy,arr);
        }
    }

}}