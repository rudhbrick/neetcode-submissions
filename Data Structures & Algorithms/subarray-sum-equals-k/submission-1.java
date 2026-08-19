class Solution{
    public int subarraySum(int[] nums,int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int prefix=0;
        int count=0;
        for(int x:nums){
            prefix+=x;
            count+=mp.getOrDefault(prefix-k,0);
            mp.put(prefix,mp.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}