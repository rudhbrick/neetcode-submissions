class Solution{
    public int[] sortedSquares(int[] nums){
        int[] result=new int[nums.length];
        int left=0,right=nums.length-1,pos=nums.length-1;
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                int square=nums[left]*nums[left];
                result[pos]=square;
                left++;
            }else{
                int square=nums[right]*nums[right];
                result[pos]=square;
                right--;
            }
            pos--;
        }
        return result;
    }
}