class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int[] unique = Arrays.stream(nums).distinct().toArray();
        int start = 0;
        int length = 1;
        int maxlength = 1;
        int i=1;
        while(i<unique.length){
            if(unique[i]==unique[start]+1){
                length++;
            }
            else{
                length = 1;
            }
            start++;
            i++;
            maxlength = length>maxlength ? length : maxlength;
        }
        return maxlength;
    }
}
