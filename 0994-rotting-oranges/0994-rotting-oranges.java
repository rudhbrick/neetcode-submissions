class Solution{
    public int orangesRotting(int[][] grid){
        Queue<int[]> q=new LinkedList<>();
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        int min=0,fresh=0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==2){
                    q.offer(new int[]{r,c});
                }else if(grid[r][c]==1){
                    fresh++;
                }
            }
        }
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                int r=curr[0],c=curr[1];
                for(int[] d:dir){
                    int nr=r+d[0],nc=c+d[1];
                    if(nr>=0&&nr<grid.length&&nc>=0&&nc<grid[0].length&&grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                        fresh--;
                    }
                }
            }
            if(!q.isEmpty()) min++;
        }
        if(fresh>0) return -1;
        return min;
    }
}