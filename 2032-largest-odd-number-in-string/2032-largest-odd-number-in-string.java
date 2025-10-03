class Solution {
    public String largestOddNumber(String num) {
        // Traverse from right to left
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i); // ✅ should be lowercase 'char' not 'Char'

            // Convert char to number by subtracting '0'
            if ((ch - '0') % 2 == 1) { // ✅ use '0' (char), not "0" (string)
                return num.substring(0, i + 1); // ✅ method is substring(), not subString()
            }
        }
        return ""; // ✅ should be outside loop
    }
}
