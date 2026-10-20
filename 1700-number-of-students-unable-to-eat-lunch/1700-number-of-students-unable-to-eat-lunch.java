class Solution{
    public int countStudents(int[] students,int[] sandwiches){
        Queue<Integer> q=new LinkedList<>();
        int refused=0,i=0;
        for(int student:students) q.offer(student);
        while(!q.isEmpty()&&refused<q.size()){
            if(q.peek()==sandwiches[i]){
                q.poll();
                i++;
                refused=0;
            }else{
                q.offer(q.poll());
                refused++;
            }
        }
        return q.size();
    }
}