class Solution{
public:
    string s;
    string longest;
    void expand(int left,int right){
        int n=s.size();
        while(left>=0&&right<n&&s[left]==s[right]){
            if(right-left+1>longest.size()){
                longest=s.substr(left,right-left+1);
            }
            left--;
            right++;
        }
    }
    string longestPalindrome(string s){
        this->s=s;
        int n=s.size();
        for (int i=0;i<n;i++) {
            expand(i,i);
            expand(i,i+1);
        }
        return longest;
    }
};