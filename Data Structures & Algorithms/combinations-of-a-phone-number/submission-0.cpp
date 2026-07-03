class Solution {
   public:
    string current;
    vector<string> ans;
    vector<string> nums={"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    string digits;
    void backtrack(int index){
        if(index==digits.length()) {
            ans.push_back(current);
            return;
        }
        string letters=nums[digits[index]-'0'];
        for(char ch:letters){
            current.push_back(ch);
            backtrack(index+1);
            current.pop_back();
        }
    }
    vector<string> letterCombinations(string digits){
        if(digits.empty()) return {};
        current.clear();
        ans.clear();
        this->digits=digits;
        backtrack(0);
        return ans;
    }
};