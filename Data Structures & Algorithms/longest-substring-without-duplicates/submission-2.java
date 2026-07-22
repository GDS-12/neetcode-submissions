class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l=0, r=0;
        int maxlen=0;
        while(r<s.length()){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            maxlen = (r-l+1)>maxlen ? (r-l+1) : maxlen;
            set.add(s.charAt(r));
            r++;
        }
        return maxlen;
    }
}
