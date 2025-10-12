class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String p =  s+s;
        return p.contains(goal);
    }
}