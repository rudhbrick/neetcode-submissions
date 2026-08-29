class Solution{
    public int characterReplacement(String s,int k){
        int[] freq=new int[26];
        int maxFreq=0,left=0,best=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);
            if((right-left+1)-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            best=Math.max(best,right-left+1);
        }
        return best;
    }
}