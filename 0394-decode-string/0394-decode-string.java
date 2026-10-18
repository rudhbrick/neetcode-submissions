class Solution{
    public String decodeString(String s){
        StringBuilder sb=new StringBuilder();
        Stack<Integer> st1=new Stack<>();
        Stack<String> st2=new Stack<>();
        int num=0;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }else if(c=='['){
                st1.push(num);
                st2.push(sb.toString());
                num=0;
                sb=new StringBuilder();
            }else if(c==']'){
                int count=st1.pop();
                String prev=st2.pop();
                String current=sb.toString();
                sb=new StringBuilder(prev);
                for(int i=0;i<count;i++) sb.append(current);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}