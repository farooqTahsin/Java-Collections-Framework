package exercises.hashMap;

import java.util.HashMap;

/*
    Given two strings ransomNote and magazine, return true if ransomNote
    can be constructed by using the letters from magazine and false otherwise.
    Each letter in magazine can only be used once in ransomNote.
*/
public class RansomNote {
    public static void main(String[]args) {
        System.out.println(canConstruct("aa","ab"));
        System.out.println(canConstruct("aa","aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mp = new HashMap<Character,Integer>(26);
        for(int i=0;i<magazine.length();i++)
            if(mp.containsKey(magazine.charAt(i)))
                mp.put(magazine.charAt(i), mp.get(magazine.charAt(i))+1);
            else
                mp.put(magazine.charAt(i), 1);
        for(int i=0;i<ransomNote.length();i++)
            if(mp.containsKey(ransomNote.charAt(i)) && mp.get(ransomNote.charAt(i))>0)
                mp.put(ransomNote.charAt(i), mp.get(ransomNote.charAt(i))-1);
            else
                return false;
        return true;
    }
}
