class Solution{
    public int maxProduct(int[] nums){
        int minProd=nums[0];
        int maxProd=nums[0];
        int best=nums[0];
        for(int i=1;i<nums.length;i++){
            int prevMin=minProd;
            int prevMax=maxProd;
            minProd=Math.min(nums[i],Math.min(prevMin*nums[i],prevMax*nums[i]));
            maxProd=Math.max(nums[i],Math.max(prevMin*nums[i],prevMax*nums[i]));
            best=Math.max(best,maxProd);
        }
        return best;
    }
}