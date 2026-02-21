import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            
            char currentChar = s.charAt(right);
            
            // If character already exists in map
            if (map.containsKey(currentChar)) {
                // Move left pointer
                left = Math.max(left, map.get(currentChar) + 1);
            }
            
            // Update last seen index
            map.put(currentChar, right);
            
            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}