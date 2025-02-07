class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        
        // Convert to lowercase and keep only alphanumeric characters
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        
        // Check if the cleaned string is a palindrome
        return cleaned.toString().equals(cleaned.reverse().toString());
    }
}
