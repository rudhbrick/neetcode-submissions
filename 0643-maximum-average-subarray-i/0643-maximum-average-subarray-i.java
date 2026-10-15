class Solution{
    public double findMaxAverage(int[] nums,int k){
        double sum=0;
        for(int i=0;i<k;i++) sum+=nums[i];
        double best=sum;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            best=Math.max(best,sum);
        }
        return best/k;
    }
}