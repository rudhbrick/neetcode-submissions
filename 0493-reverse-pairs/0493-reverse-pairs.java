class Solution{
    public int reversePairs(int[] nums){
        if(nums==null||nums.length<=1) return 0;
        return mergeSortAndCount(nums,0,nums.length-1);
    }
    int mergeSortAndCount(int[] arr,int left,int right){
        if(left>=right) return 0;
        int mid=left+(right-left)/2,count=0; 
        count+=mergeSortAndCount(arr,left,mid);
        count+=mergeSortAndCount(arr,mid+1,right);
        count+=countAndMerge(arr,left,mid,right);
        return count;
    }
    int countAndMerge(int[] arr,int left,int mid,int right){
        int count=0,j=mid+1;
        for(int i=left;i<=mid;i++){
            while(j<=right&&(long)arr[i]>2L*arr[j]) j++;
            count+=(j-(mid+1));
        }
        int n1=mid-left+1,n2=right-mid;
        int[] leftArr=new int[n1],rightArr=new int[n2];
        for(int i=0;i<n1;i++) leftArr[i]=arr[left+i];
        for(int i=0;i<n2;i++) rightArr[i]=arr[mid+1+i];
        int p1=0,p2=0,k=left;
        while(p1<n1&&p2<n2){
            if(leftArr[p1]<=rightArr[p2]){
                arr[k++]=leftArr[p1++];
            }else{
                arr[k++]=rightArr[p2++];
            }
        }
        while(p1<n1) arr[k++]=leftArr[p1++];
        while(p2<n2) arr[k++]=rightArr[p2++];
        return count;
    }
}