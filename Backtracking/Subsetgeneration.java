package Backtracking;
import java.util.*;
public class Subsetgeneration{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //subset sum
        int targetsum=89;
        int[]arr={1,3,7,5};
        if(subset(arr,0,0,targetsum)){
            System.out.println("yes");
            return;
        }

        System.out.println("No");}
        public static boolean subset(int[] arr,int index,int sum,int targetsum){
            if(sum==targetsum){
                return true;
            }
            if(index>=arr.length){
                return false;
            }
            //pruning can be done [eery number is possitive];
             if(sum>targetsum){
                return false;
             }
            if(subset(arr,index+1,sum+arr[index],targetsum)){
                return true;
            }
       return subset(arr,index+1,sum,targetsum);
        }}

