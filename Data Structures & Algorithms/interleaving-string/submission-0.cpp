class Solution{
public:
    string s1;
    string s2;
    string s3;
    unordered_map<string,int> memo;
    bool dfs(int i,int j){
        int k=i+j;
        if (i==s1.size()&&j==s2.size())return true;
        bool takeS1=false;
        bool takeS2=false;
        string key=to_string(i)+','+to_string(j);
        if(memo.count(key)) return memo[key];
        if(i<s1.size()){
                if(s1[i]==s3[k]){
                takeS1=dfs(i+1,j);
            }
        }
        if(j<s2.size()){
                if(s2[j]==s3[k]){
                takeS2=dfs(i,j+1);
            }
        }
        memo[key]=takeS1||takeS2;
        return memo[key];
    }
    bool isInterleave(string s1, string s2, string s3){
        this->s1=s1;
        this->s2=s2;
        this->s3=s3;
        if(s3.size()!=s1.size()+s2.size()) return false;
        return dfs(0,0);
    }
};