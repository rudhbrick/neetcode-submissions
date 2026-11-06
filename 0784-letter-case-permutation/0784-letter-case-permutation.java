class Solution{
    void permutation(String s,int index,StringBuilder sb,List<String> ans){
        if(index==s.length()){
            ans.add(sb.toString());
            return;
        }
        char c=s.charAt(index);
        if(Character.isDigit(c)){
            sb.append(c);
            permutation(s,index+1,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }else{
            sb.append(Character.toLowerCase(c));
            permutation(s,index+1,sb,ans);
            sb.deleteCharAt(sb.length()-1);
            sb.append(Character.toUpperCase(c));
            permutation(s,index+1,sb,ans);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCasePermutation(String s){
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int index=0;
        permutation(s,index,sb,ans);
        return ans;
    }
}