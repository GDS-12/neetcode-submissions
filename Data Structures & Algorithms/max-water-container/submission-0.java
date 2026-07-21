class Solution {
    public int maxArea(int[] heights) {
        int maxarea=0,area=0;
        int i=0;
        int j=heights.length-1;
        while(i<=j){
            area = (j-i)*(Math.min(heights[i],heights[j]));
            maxarea = area>maxarea ? area : maxarea;
            if(heights[i] < heights[j]) i++;
            else j--;
        }
        return maxarea;
    }
}
