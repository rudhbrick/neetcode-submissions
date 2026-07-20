class Solution{
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals,vector<int>& newInterval){
        vector<vector<int>> ans;
        int newL=newInterval[0];
        int newR=newInterval[1];
        bool inserted=false;
        for(int i=0;i<intervals.size();i++){
            int l=intervals[i][0];
            int r=intervals[i][1];
            if(r<newL){
                ans.push_back(intervals[i]);
            }else if(l>newR){
                if(inserted==false){
                    ans.push_back({newL,newR});
                    inserted=true;
                }
                ans.push_back(intervals[i]);
            }else{
                newL=min(l,newL);
                newR=max(r,newR);
            }
        }
        if (!inserted){
            ans.push_back({newL,newR});
        }
        return ans;
    }
};