class Solution{
    public String simplifyPath(String path){
        Stack<String> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        String[] words=path.split("/");
        for(String word:words){
            if(word.equals("..")){
                if(!st.isEmpty()) st.pop();
            }else if(word.equals(".")||word.equals("")){
                continue;
            }else{
                st.push(word);
            }
        }
        for(String word:st){
            sb.append("/");
            sb.append(word);
        }
        return sb.length()==0?"/":sb.toString();
    }
}