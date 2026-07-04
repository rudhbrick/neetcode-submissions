class Solution {
public:
    vector<vector<string>> ans;
    vector<string> subset;
    string s;
    bool isPalindrome(int left,int right){
        while(left<right){
            if(s[left]!=s[right]) return false;
            left++;
            right--;
        }
        return true;
    }
    void backtrack(int index){
        if(index==s.size()){
            ans.push_back(subset);
            return;
        }
        for(int end=index;end<s.size();end++){
            if(isPalindrome(index,end)){
                string sub=s.substr(index,end-index+1);
                subset.push_back(sub);
                backtrack(end+1);
                subset.pop_back();
            }
        }
    }
    vector<vector<string>> partition(string s) {
        ans.clear();
        subset.clear();
        this->s=s;
        backtrack(0);
        return ans;
    }
};