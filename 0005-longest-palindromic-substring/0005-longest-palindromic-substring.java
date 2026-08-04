class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.length()<1) return "";
        int start =0;
        int end =0;
        for(int i=0;i<s.length();i++){
            int l1 = function(s,i,i);
            int l2 = function(s,i,i+1);
            int max = Math.max(l1,l2);
            
            if(max>end-start){
                start = i-(max-1)/2;
                end = i+max/2;
            }
        }
        return s.substring(start,end+1);
    }

        public int function(String s, int left, int right){
            int l=left, r=right;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                l--;
                r++;

            }
            return r-l-1;
    }
}
