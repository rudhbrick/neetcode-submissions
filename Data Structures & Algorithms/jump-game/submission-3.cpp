class Solution{
public:
    bool canJump(vector<int>& nums){
        int n=nums.size();
        int fart=0;
        for(int i=0;i<n;i++){
            if(i>fart) return false;
            fart=max(fart,nums[i]+i);
        }
        return true;
    }
};