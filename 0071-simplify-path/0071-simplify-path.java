class Solution{
    public String simplifyPath(String path){
        StringBuilder sb=new StringBuilder();
        Stack<String> st=new Stack<>();
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