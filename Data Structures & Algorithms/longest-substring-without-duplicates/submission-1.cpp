class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_set<char> seen;
        int best=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            while(seen.count(s[right])){
                seen.erase(s[left]);
                left++;
            }
            seen.insert(s[right]);
            int current=right-left+1;
            best=max(best,current);
        }
        return best;
    }
};