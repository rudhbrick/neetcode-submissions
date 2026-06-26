class Solution {
public:
    int leastInterval(vector<char>& tasks, int n) {
        vector<int> freq(26);
        int maxFreq=0;
        int maxCount=0;
        for(char task:tasks){
            freq[task-'A']++;
        }
        maxFreq = *max_element(freq.begin(), freq.end());
        for(int f : freq){
            if(f == maxFreq){
                maxCount++;
            }
        }
        return max((int)tasks.size(),(maxFreq-1)*(n+1)+maxCount);
    }
};