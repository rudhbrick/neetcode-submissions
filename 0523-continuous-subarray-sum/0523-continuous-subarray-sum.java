class Solution{
    public boolean checkSubarraySum(int[] nums,int k){
        if(k==0) return false;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int remainder=((prefix%k)+k)%k;
            if(mp.containsKey(remainder)){
                if(i-mp.get(remainder)>=2) return true;
            }else{
                mp.put(remainder,i);
            }
        }
        return false;
    }
}