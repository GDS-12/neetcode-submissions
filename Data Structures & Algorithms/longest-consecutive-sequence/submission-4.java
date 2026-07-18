class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int maxlength = 1;
        for(int n : set){
            int length=0;
            if(!set.contains(n-1)){
                while(set.contains(n+length)){
                    length++;
                }
            }
            maxlength=length>maxlength ? length : maxlength;
        }
        return maxlength;
    }
}
