class Solution{
    boolean canShip(int[] weights,int days,int capacity){
        int daysUsed=1,currWeight=0;
        for(int weight:weights){
            if(currWeight+weight>capacity){
                daysUsed++;
                currWeight=0;
            }
            currWeight+=weight;
        }
        return daysUsed<=days;
    }
    public int shipWithinDays(int[] weights,int days){
        int left=0,right=0;
        for(int weight:weights) left=Math.max(left,weight);
        for(int weight:weights) right+=weight;
        while(left<right){
            int mid=left+(right-left)/2;
            if(canShip(weights,days,mid)){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}