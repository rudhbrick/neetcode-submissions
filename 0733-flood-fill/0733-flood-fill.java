class Solution{
    void dfs(int[][] image,int sr,int sc,int originalColor,int color){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=originalColor||originalColor==color) return;
        image[sr][sc]=color;
        dfs(image,sr+1,sc,originalColor,color);
        dfs(image,sr-1,sc,originalColor,color);
        dfs(image,sr,sc+1,originalColor,color);
        dfs(image,sr,sc-1,originalColor,color);
    }
    public int[][] floodFill(int[][] image,int sr,int sc,int color){
        int originalColor=image[sr][sc];
        dfs(image,sr,sc,originalColor,color);
        return image;
    }
}