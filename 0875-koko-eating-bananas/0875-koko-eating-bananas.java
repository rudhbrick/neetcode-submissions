class Solution{
    public int minEatingSpeed(int[] piles,int h){
        int left=1,right=0,ans=0;
        for(int pile:piles) right=Math.max(right,pile);
        while(left<=right){
            int mid=left+(right-left)/2;
            long total=0;
            for(int pile:piles) total+=(pile+mid-1)/mid;
            if(total>h) left=mid+1;
            else{
                ans=mid;
                right=mid-1;
            }
        }
        return ans;
    }
}