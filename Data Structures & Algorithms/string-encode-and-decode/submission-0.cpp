class Solution {
public:
    string encode(vector<string>& strs) {
        string encoded="";
        for(string word:strs){
            encoded+=to_string(word.length());
            encoded+="#";
            encoded+=word;
        }
        return encoded;
    }
    vector<string> decode(string s) {
        vector<string> result;
        int i=0;
        while(i<s.length()){
            int j=s.find('#',i);
            int len=stoi(s.substr(i,j-i));
            string word=s.substr(j+1,len);
            result.push_back(word);
            i=j+1+len;
        }
        return result;
    }
};