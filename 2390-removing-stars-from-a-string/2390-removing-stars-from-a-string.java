class Solution{
    public String removeStars(String s){
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(!st.isEmpty()&&c=='*'){
                st.pop();
            }else{
                st.push(c);
            }
        }
        for(int i=0;i<st.size();i++) sb.append(st.get(i));
        return sb.toString();
    }
}