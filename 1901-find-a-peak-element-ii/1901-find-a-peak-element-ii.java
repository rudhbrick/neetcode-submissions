class Solution{
    public int[] findPeakGrid(int[][] mat){
        int left=0,right=mat[0].length-1;
        while(left<=right){
            int mid=left+(right-left)/2,maxRow=0;
            for(int i=1;i<mat.length;i++) if(mat[i][mid]>mat[maxRow][mid]) maxRow=i;
            int leftVal=mid>0?mat[maxRow][mid-1]:-1,rightVal=mid<mat[0].length-1?mat[maxRow][mid+1]:-1,curr=mat[maxRow][mid];
            if(curr<rightVal){
                left=mid+1;
            }else if(curr<leftVal){
                right=mid-1;
            }else if(curr>leftVal&&curr>rightVal){
                return new int[]{maxRow,mid};
            }
        }
        return new int[]{};
    }
}