class Solution{
    public int maxArea(int[] heights){
        int l=0;
        int r=heights.length-1;
        int best=0;
        while(l<r){
            int area=(r-l)*Math.min(heights[l],heights[r]);
            best=Math.max(best,area);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return best;
    }
}