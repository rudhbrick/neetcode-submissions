class Solution{
    public int evalRPN(String[] tokens){
        Stack<Integer> st=new Stack<>();
        for(String c:tokens){
            if(c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/")){
                int a=st.pop(),b=st.pop();
                switch(c.charAt(0)){
                    case '+':
                        st.push(a+b);
                        break;
                    case '-':
                        st.push(b-a);
                        break;
                    case '*':
                        st.push(a*b);
                        break;
                    case '/':
                        st.push(b/a);
                        break;
                }
            }else{
                st.push(Integer.parseInt(c));
            }
        }
        return st.pop();
    }
}