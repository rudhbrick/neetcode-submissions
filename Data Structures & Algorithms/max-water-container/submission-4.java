class Solution{
    public int maxArea(int[] heights){
        int left=0,right=heights.length-1,best=0,area;
        while(left<right){
            area=Math.min(heights[left],heights[right])*(right-left);
            best=Math.max(best,area);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return best;
    }
}