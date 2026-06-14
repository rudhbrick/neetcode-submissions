class Solution {
public:
    int maxArea(vector<int>& heights) {
        int best=0;
        int left=0;
        int right=heights.size()-1;
        int area;
        while(left<right){
            area=min(heights[left], heights[right])*(right-left);
            best=max(best,area);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return best;
    }
};