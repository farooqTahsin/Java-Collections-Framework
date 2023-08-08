package exercises.hashMap;

/*
    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.
*/

import java.util.*;

public class GroupAnagrams {
    public static void main(String[]args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String>> mp = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);
            if(!mp.containsKey((s)))
                mp.put(s , new ArrayList<>());
            mp.get(s).add(strs[i]);
        }
        return new ArrayList<>(mp.values());
    }
}
