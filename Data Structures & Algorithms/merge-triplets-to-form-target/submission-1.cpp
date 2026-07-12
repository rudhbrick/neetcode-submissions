class Solution{
public:
    bool mergeTriplets(vector<vector<int>>& triplets,vector<int>& target){
        vector<bool> matched(3,false);
        for(auto &triplet:triplets){
            if(triplet[0]>target[0]||triplet[1]>target[1]||triplet[2]>target[2]) continue;
            if(triplet[0]==target[0]) matched[0]=true;
            if(triplet[1]==target[1]) matched[1]=true;
            if(triplet[2]==target[2]) matched[2]=true;
        }
        return matched[0]&&matched[1]&&matched[2];
    }
};