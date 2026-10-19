class Solution{
    public int calculate(String s){
        Stack<Integer> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()) sb.append(c);
        sb.append('+');
        String str=sb.toString();
        int num=0;
        char prevOp='+';
        int ans=0;
        for(char c:str.toCharArray()){
            if(c=='+'||c=='-'||c=='*'||c=='/'){
                if(prevOp=='+'){
                    st.push(num);
                }else if(prevOp=='-'){
                    st.push(-num);
                }else if(prevOp=='*'){
                    st.push(st.pop()*num);
                }else if(prevOp=='/'){
                    st.push(st.pop()/num);
                }
                num=0;
                prevOp=c;
            }else if(c==' '){
                continue;
            }else{
                num=num*10+(c-'0');
            }
        }
        while(!st.isEmpty()) ans+=st.pop();
        return ans;
    }
}