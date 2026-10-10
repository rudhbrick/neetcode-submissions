class Solution{
    public int majorityElement(int[] nums){
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
            if(mp.get(i)>n/2) return i;
        }
        return -1;
    }
}