package Lecture_01;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	public static  int lengthOfLongestSubstring(String s) {
        int si=0;// starting index of sliding window
        int ei=0;// ending index of sliding window
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(ei<s.length()) {
        	char ch=s.charAt(ei);
        	if(map.containsKey(ch)) {
        		int pfreq=map.get(ch);
        		map.put(ch, pfreq+1);
        	}
        	else {
        		map.put(ch, 1);
        	}
        	
        	while(map.get(ch)>1 && si<=ei) {
        		int currfreq=map.get(s.charAt(si));
        		map.put(s.charAt(si), currfreq-1);
        		si++;
        	}
        	max=Math.max(ei-si+1, max);
        	ei++;//expansion of window
        
        }
		return max;
        
    }

}
