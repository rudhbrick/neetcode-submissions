class Solution{
    public int timeRequiredToBuy(int[] tickets,int k){
        Queue<int[]> q=new LinkedList<>();
        int seconds=0;
        for(int i=0;i<tickets.length;i++) q.offer(new int[]{tickets[i],i});
        while(!q.isEmpty()){
            int[] person=q.poll();
            person[0]--;
            seconds++;
            if(person[1]==k&&person[0]==0) break;
            if(person[0]>0) q.offer(person);
        }
        return seconds;
    }
}