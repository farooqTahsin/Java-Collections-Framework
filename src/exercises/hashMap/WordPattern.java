package exercises.hashMap;

/*
    Given a pattern and a string s, find if s follows the same pattern.
    Here follow means a full match, such that there is a bijection
    between a letter in pattern and a non-empty word in s.
*/

import java.util.HashMap;

public class WordPattern {
    public static void main(String[]args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
        System.out.println(wordPattern("abba","dog cat cat fish"));
    }
    public static boolean wordPattern(String pattern, String s) {
        String [] arr = s.split(" ");
        if(pattern.length()!=arr.length)return false;
        HashMap<Character,String> mp = new HashMap<Character,String>();
        for(int i=0;i<pattern.length();i++) {
            if(mp.containsKey(pattern.charAt(i))) {
                if(!mp.get(pattern.charAt(i)).equals(arr[i]))
                    return false;
            }
            else {
                if(mp.containsValue(arr[i])) return false;
                mp.put(pattern.charAt(i), arr[i]);
            }
        }
        return true;
    }
}
