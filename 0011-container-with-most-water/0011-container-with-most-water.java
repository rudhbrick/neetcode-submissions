class Solution{
    public int maxArea(int[] height){
        int left=0,right=height.length-1,area,best=0;
        while(left<right){
            area=Math.min(height[left],height[right])*(right-left);
            best=Math.max(best,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return best;
    }
}