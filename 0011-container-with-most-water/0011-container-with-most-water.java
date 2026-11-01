class Solution{
    public int maxArea(int[] height){
        int left=0,right=height.length-1,area=0,best=0;
        for(int i=0;i<height.length;i++){
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