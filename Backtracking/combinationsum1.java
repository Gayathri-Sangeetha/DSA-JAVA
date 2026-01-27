/*Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []
 

Constraints:

1 <= candidates.length <= 30
2 <= candidates[i] <= 40
All elements of candidates are distinct.
1 <= target <= 40*/


package Backtracking;
import java.util.*;
public class combinationsum1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[]candidates=new int[m];
        for(int i=0;i<candidates.length;i++){
            candidates[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        List<List<Integer>>wraplist=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        backtracking(candidates,target,wraplist,list,0,0);
for(int i=0;i<wraplist.size();i++){
    System.out.println(wraplist.get(i));
}
    }
    public static void backtracking(int[]candidates,int target,List<List<Integer>>wraplist,List<Integer>list,
        int index,int sum)
    {
        //goal
        if(sum==target){
          wraplist.add(new ArrayList(list));
          return;
        }

        //pruning
        if (index>=candidates.length||sum>target) {
           return; 
        }
        list.add(candidates[index]);
        backtracking(candidates,target,wraplist,list,index,sum+candidates[index]);
        list.remove(list.size()-1);
        backtracking(candidates,target,wraplist,list,index+1,sum);
    }
}
