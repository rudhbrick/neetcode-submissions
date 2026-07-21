class Solution{
public:
       vector<vector<int>> merge(vector<vector<int>>& intervals){
        if (intervals.size()<2) return intervals;
        std::sort(intervals.begin(),intervals.end());
        int current=0;
        for(int i=0;i<intervals.size();i++){
            int begin=intervals[i][0];
            int end=intervals[i][1];
            int& current_end=intervals[current][1];
            if (begin <= current_end){
                current_end=std::max(current_end,end);
            }
            else{
                current++;
                intervals[current]=intervals[i];
            }
        }
        intervals.resize(current+1);
        return intervals;
    }
};