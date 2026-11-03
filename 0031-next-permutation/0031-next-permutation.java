class Solution{
    public void nextPermutation(int[] nums){
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            int left=0,right=nums.length-1;
            while(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
            return;
        }
        int candidate=-1;
        for(int j=nums.length-1;j>=0;j--){
            if(j>pivot&&nums[j]>nums[pivot]){
                candidate=j;
                break;
            }
        }
        int temp=nums[pivot];
        nums[pivot]=nums[candidate];
        nums[candidate]=temp;
        int left=pivot+1,right=nums.length-1;
        while(left<right){
            int t=nums[left];
            nums[left]=nums[right];
            nums[right]=t;
            left++;
            right--;
        }
    }
}