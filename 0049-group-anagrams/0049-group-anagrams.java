class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String,ArrayList<String>> mp=new HashMap<>();
        for(String word:strs){
            char[] s=word.toCharArray();
            Arrays.sort(s);
            String key=new String(s);
            if(!mp.containsKey(key)) mp.put(key,new ArrayList<>());
            mp.get(key).add(word);
        }
        return new ArrayList<>(mp.values());
    }
}