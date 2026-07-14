class Solution{
public:
    string word1;
    string word2;
    vector<vector<int>> memo;
    int dfs(int i,int j){
        if(i==word1.size()) return word2.size()-j;
        if(j==word2.size()) return word1.size()-i;
        if(memo[i][j]!=-1) return memo[i][j];
        if(word1[i]==word2[j]){
            memo[i][j]=dfs(i+1,j+1);
            return memo[i][j];
        }
        int rep=dfs(i+1,j+1);
        int del=dfs(i+1,j);
        int ins=dfs(i,j+1);
        memo[i][j]=1+min(rep,min(del,ins));
        return memo[i][j];
    }
    int minDistance(string word1,string word2){
        this->word1=word1;
        this->word2=word2;
        memo=vector<vector<int>>(word1.size()+1,vector<int>(word2.size()+1,-1));
        return dfs(0,0);
    }
};