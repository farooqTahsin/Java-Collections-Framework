package exercises.hashMap;

/*
    Given an integer array nums and an integer k,
    return true if there are two distinct indices i and j
    in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*/

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[]args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3));
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            if(mp.containsKey(nums[i]) && Math.abs(mp.get(nums[i])-i)<=k)
                return true;
            mp.put(nums[i],i);
        }
        return false;
    }
}
