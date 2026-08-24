class Solution{
    public int maxArea(int[] heights){
        int best=0,left=0,right=heights.length-1,area;
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