class Solution {
    public int lengthOfLongestSubstring(String s) {
      int start = 0;
      int end = 0;
      int len = Math.min(s.length(),1);
      Set<Character>seen = new HashSet<>();
      while(end<s.length()){
            char c = s.charAt(end);
            while(seen.contains(c)){
                seen.remove(s.charAt(start));
                start+=1;
            }
            seen.add(c);
            int size = end-start+1;
            len = Math.max(len,size);
            end+=1;

      }  
      return len;
    }
}