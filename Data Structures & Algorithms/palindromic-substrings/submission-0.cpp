class Solution {
public:
    string s;
    int count=0;
    void expand(int left,int right){
        int n=s.size();
        while(left>=0&&right<n&&s[left]==s[right]){
            count++;
            left--;
            right++;
        }
    }
    int countSubstrings(string s) {
        this->s=s;
        int n=s.size();
        for (int i=0;i<n;i++) {
            expand(i,i);
            expand(i,i+1);
        }
        return count;
    }
};