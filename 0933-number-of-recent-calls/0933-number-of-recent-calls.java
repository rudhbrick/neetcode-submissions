class RecentCounter{
    int count;
    Queue<Integer> q;
    public RecentCounter(){
        count=0;
        q=new LinkedList<>();
    }
    public int ping(int t){
        q.offer(t);
        while(q.peek()<t-3000) q.poll();
        return q.size();
    }
}