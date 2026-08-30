class Solution{
    public String reorganizeString(String s){
        int[] freq=new int[26];
        for(char c:s.toCharArray()) freq[c-'a']++;
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<26;i++) if(freq[i]>0) q.offer(new int[]{i,freq[i]});
        StringBuilder sb=new StringBuilder();
        int prevChar=-1,prevFreq=0;
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int currChar=curr[0],currFreq=curr[1];
            sb.append((char)('a'+currChar));
            prevFreq--;
            if(prevFreq>0) q.offer(new int[]{prevChar,prevFreq});
            prevChar=currChar;
            prevFreq=currFreq;
        }
        return sb.length()==s.length()?sb.toString():"";
    }
}