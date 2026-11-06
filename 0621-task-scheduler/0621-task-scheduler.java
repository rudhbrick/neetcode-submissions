class Solution{
    public int leastInterval(char[] tasks,int n){
        int[] freq=new int[26];
        int maxFreq=0,maxCount=0;
        for(char task:tasks) freq[task-'A']++;
        for(int i=0;i<freq.length;i++) maxFreq=Math.max(maxFreq,freq[i]);
        for(int f:freq) if(f==maxFreq) maxCount++;
        return Math.max(tasks.length,(maxFreq-1)*(n+1)+maxCount);
    }
}