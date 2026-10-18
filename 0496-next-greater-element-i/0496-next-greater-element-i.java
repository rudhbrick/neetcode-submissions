class Solution{
    public int[] nextGreaterElement(int[] nums1,int[] nums2){
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        int[] result=new int[nums1.length];
        for(int num:nums2){
            while(!st.isEmpty()&&num>st.peek()){
                int old=st.pop();
                mp.put(old,num);
            }
            st.push(num);
        }
        while(!st.isEmpty()) mp.put(st.pop(),-1);
        for(int i=0;i<nums1.length;i++) result[i]=mp.get(nums1[i]);
        return result;
    }
}