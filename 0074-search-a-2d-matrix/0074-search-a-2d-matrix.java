class Solution{
    public boolean searchMatrix(int[][] matrix, int target){
        int rows=matrix.length,cols=matrix[0].length,left=0,right=(rows*cols)-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int row=mid/cols,col=mid%cols;
            if(matrix[row][col]<target) left=mid+1;
            else if(matrix[row][col]>target) right=mid-1;
            else if(matrix[row][col]==target) return true;
        }
        return false;
    }
}