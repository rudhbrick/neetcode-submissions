class Solution{
    public int[] nextGreaterElement(int[] nums1,int[] nums2){
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        int[] ans=new int[nums1.length];
        for(int num:nums2){
            while(!st.isEmpty()&&num>st.peek()) mp.put(st.pop(),num);
            st.push(num);
        }
        while(!st.isEmpty()) mp.put(st.pop(),-1);
        for(int i=0;i<nums1.length;i++) ans[i]=mp.get(nums1[i]);
        return ans;
    }
}