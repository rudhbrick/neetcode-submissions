class Solution{
    public int subarraysDivByK(int[] nums,int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int prefix=0,count=0;
        for(int num:nums){
            prefix+=num;
            int remainder=((prefix%k)+k)%k;
            count+=mp.getOrDefault(remainder,0);
            mp.put(remainder,mp.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}