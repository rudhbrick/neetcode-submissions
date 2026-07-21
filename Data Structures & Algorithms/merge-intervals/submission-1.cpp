class Solution{
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals){
        if(intervals.empty()) return {};
        vector<vector<int>> ans;
        sort(intervals.begin(),intervals.end());
        int currL=intervals[0][0];
        int currR=intervals[0][1];
        for(int i=1;i<intervals.size();i++){
            int l=intervals[i][0];
            int r=intervals[i][1];
            if(l<=currR){
                currL=min(currL,l);
                currR=max(currR,r);
            }else{
                ans.push_back({currL,currR});
                currL=l;
                currR=r;
            }
        }
        ans.push_back({currL,currR});
        return ans;
    }
};