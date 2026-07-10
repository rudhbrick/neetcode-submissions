class Solution{
public:
    int maxProduct(vector<int>& nums){
        int minProd=nums[0];
        int maxProd=nums[0];
        int answer=nums[0];
        for(int i=1;i<nums.size();i++){
            int prevMin=minProd;
            int prevMax=maxProd;
            minProd=min({nums[i],prevMin*nums[i],prevMax*nums[i]});
            maxProd=max({nums[i],prevMin*nums[i],prevMax*nums[i]});
            answer=max(answer,maxProd);
        }
        return answer;
    }
};