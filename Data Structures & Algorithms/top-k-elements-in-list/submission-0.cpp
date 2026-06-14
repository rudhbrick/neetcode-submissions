class Solution {
public:
    static bool compare(pair<int,int> a, pair<int,int> b){
        return a.second>b.second;
    }
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        vector<pair<int,int>> freq;
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;
        }
        for(auto value:mp){
            freq.push_back(value);
        }
        sort(freq.begin(),freq.end(),compare);
        for(int i=0;i<k;i++){
            ans.push_back(freq[i].first);
        }
        return ans;
    }
};
