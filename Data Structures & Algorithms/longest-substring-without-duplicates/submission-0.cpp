class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_set<char> seen;
        int best_len=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            while(seen.count(s[right])){
                seen.erase(s[left]);
                left++;
            }
            seen.insert(s[right]);
            int currentLen=right-left+1;
            best_len=max(best_len,currentLen);
        }
        return best_len;
    }
};