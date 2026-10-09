class Solution{
    public int bagOfTokensScore(int[] tokens,int power){
        Arrays.sort(tokens);
        int left=0,right=tokens.length-1,score=0,max=0;
        while(left<=right){
            if(tokens[left]<=power){
                power-=tokens[left];
                left++;
                score++;
                max=Math.max(max,score);
            }else if(score>0){
                power+=tokens[right];
                right--;
                score--;
            }else{
                break;
            }
        }
        return max;
    }
}