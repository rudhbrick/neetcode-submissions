class Solution{
    public String removeKdigits(String num,int k){
        Stack<Integer> st=new Stack<>();
        for(char c:num.toCharArray()){
            int x=c-'0';
            while(!st.isEmpty()&&k>0&&st.peek()>x){
                st.pop();
                k--;
            }
            st.push(x);
        }
        while(k>0&&!st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop());
        sb.reverse();
        int i=0;
        while(i<sb.length()&&sb.charAt(i)=='0') i++;
        return i==sb.length()?"0":sb.substring(i);
    }
}