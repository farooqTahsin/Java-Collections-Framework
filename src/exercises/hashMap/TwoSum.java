package exercises.hashMap;

/*
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
*/

import java.util.*;

public class TwoSum {
    public static void main(String[]args) {
        int arr[]={2,7,11,5};
        int ans[] =twoSum(arr, 9);
        System.out.println(ans[0]+" "+ ans[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            mp.put(nums[i],i);
        for(int i=0;i<nums.length;i++) {
            int comp = target-nums[i];
            if( mp.containsKey(comp) && mp.get(comp)!=i )
                return new int[]{i,mp.get(comp)};
        }
        return null;
    }
}
