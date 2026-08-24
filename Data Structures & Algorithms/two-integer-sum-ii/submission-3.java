class Solution{
    public int[] twoSum(int[] numbers, int target){
        int n=numbers.length,left=0,right=n-1;
        while(left<right){
            if(numbers[left]+numbers[right]<target){
                left++;
            }else if(numbers[left]+numbers[right]>target){
                right--;
            }else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{};
    }
}