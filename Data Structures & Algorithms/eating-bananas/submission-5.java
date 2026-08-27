class Solution{
    public int minEatingSpeed(int[] piles,int h){
        int left=1,right=0;
        for(int pile:piles) right=Math.max(right,pile);
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            long totalHours=0;
            for(int pile:piles) totalHours+=(pile+mid-1)/mid;
            if(totalHours>h){
                left=mid+1;
            }else{
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
    }
}