class Solution{
    public int minFallingPathSum(int[][] matrix){
        int m=matrix.length,n=matrix[0].length;
        int[][] dp=new int[m][n];
        for(int j=0;j<n;j++) dp[0][j]=matrix[0][j];
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int best=dp[i-1][j];
                if(j>0) best=Math.min(best,dp[i-1][j-1]);
                if(j<n-1) best=Math.min(best,dp[i-1][j+1]);
                dp[i][j]=matrix[i][j]+best;
            }
        }
        int ans=dp[n-1][0];
        for(int j=1;j<n;j++) ans=Math.min(ans,dp[n-1][j]);
        return ans;
    }
}