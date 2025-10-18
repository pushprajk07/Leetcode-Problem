class Solution {
    public int maxDepth(String s) {
      int ans = 0;
      int maxDepth =0;
      for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        if (ch  =='('){
            ans++;
           

        }
        if(ch ==')'){
            ans--;
        }
         maxDepth = Math.max(ans,maxDepth);
      }  
      return maxDepth;

    }
}