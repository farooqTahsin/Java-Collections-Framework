package exercises.hashMap;

/*
    Given two strings s and t, determine if they are isomorphic.
    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    All occurrences of a character must be replaced with another character
    while preserving the order of characters. No two characters may map to
    the same character, but a character may map to itself.
*/

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[]args) {
        System.out.println(isIsomorphic("paper","title"));
        System.out.println(isIsomorphic("foo","bar"));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character, Character> mp = new HashMap<Character, Character>();
        for(int i=0;i<s.length();i++) {
            if (mp.containsKey(s.charAt(i))) {
                if (mp.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else {
                if(mp.containsValue(t.charAt(i)))return false;
                mp.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
