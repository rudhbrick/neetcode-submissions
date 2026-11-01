class Solution{
    public List<Integer> findAnagrams(String s, String p){
        List<Integer> ans=new ArrayList<>();
        if(p.length()>s.length()) return ans;
        int[] freq1=new int[26],freq2=new int[26];
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        int left=0;
        if(Arrays.equals(freq1,freq2)) ans.add(left);
        for(int right=p.length();right<s.length();right++){
            freq2[s.charAt(left)-'a']--;
            freq2[s.charAt(right)-'a']++;
            left++;
            if(Arrays.equals(freq1,freq2)) ans.add(left);
        }
        return ans;
    }
}