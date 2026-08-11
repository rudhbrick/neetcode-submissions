class Solution{
    public int[] topKFrequent(int[] nums,int k){
        HashMap<Integer,Integer> mp=new HashMap<>();
        List<int[]> freq=new ArrayList<>();
        int[] ans=new int[k];
        for(int x:nums){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            freq.add(new int[]{entry.getKey(),entry.getValue()});
        }
        freq.sort((a,b)->b[1]-a[1]);
        for(int i=0;i<k;i++){
            ans[i]=freq.get(i)[0];
        }
        return ans;
    }
}