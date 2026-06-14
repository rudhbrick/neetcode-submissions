class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> st;
        for(int i=0;i<nums.size();i++){
            st.insert(nums[i]);
        }
        int currentNum;
        int currentLength;
        int longest=0;
        for(auto x:st){
            if(!st.count(x-1)){
                currentNum=x;
                currentLength=1;
                while(st.count(currentNum+1)){
                    currentNum++;
                    currentLength++;
                }
                longest=max(longest,currentLength);
            }
        }
        return longest;
    }
};
