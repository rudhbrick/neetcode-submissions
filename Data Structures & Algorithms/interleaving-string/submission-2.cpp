class Solution{
public:
    string s1;
    string s2;
    string s3;
    vector<vector<int>> memo;
    bool dfs(int i,int j){
        int k=i+j;
        if (i==s1.size()&&j==s2.size())return true;
        bool takeS1=false;
        bool takeS2=false;
        if(memo[i][j]!=-1) return memo[i][j];
        if(i<s1.size()&&s1[i]==s3[k]){
            takeS1=dfs(i+1,j);
        }
        if(j<s2.size()&&s2[j]==s3[k]){
            takeS2=dfs(i,j+1);
        }
        memo[i][j]=takeS1||takeS2;
        return memo[i][j];
    }
    bool isInterleave(string s1, string s2, string s3){
        this->s1=s1;
        this->s2=s2;
        this->s3=s3;
        if(s3.size()!=s1.size()+s2.size()) return false;
        memo=vector<vector<int>>(s1.size()+1,vector<int>(s2.size()+1,-1));
        return dfs(0,0);
    }
};