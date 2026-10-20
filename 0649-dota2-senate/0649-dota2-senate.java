class Solution{
    public String predictPartyVictory(String senate){
        int n=senate.length();
        Queue<Integer> rad=new LinkedList<>(),dir=new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R') rad.offer(i);
            else dir.offer(i);
        }
        while(!rad.isEmpty()&&!dir.isEmpty()){
            int r=rad.poll(),d=dir.poll();
            if(r<d){
                rad.offer(r+n);
            }else{
                dir.offer(d+n);
            }
        }
        return !rad.isEmpty()?"Radiant":"Dire";
    }
}