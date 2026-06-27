class Twitter {
public:
    unordered_map<int,vector<pair<int,int>>> tweets;
    unordered_map<int,unordered_set<int>> following;
    int timeStamp=0;
    Twitter(){
        
    }
    void postTweet(int userId, int tweetId){
        timeStamp++;
        tweets[userId].push_back({timeStamp, tweetId});
    }
    vector<int> getNewsFeed(int userId){
        priority_queue<pair<int,int>> q;
        vector<int> ans;
        for(auto tweet:tweets[userId]){
            q.push(tweet);
        }
        for(auto followee:following[userId]){
            for(auto tweet:tweets[followee]){
                q.push(tweet);
            }
        }
        while(!q.empty()&&ans.size()<10){
            ans.push_back(q.top().second);
            q.pop();
        }
        return ans;
    }
    void follow(int followerId, int followeeId){
        if(followerId!=followeeId){
            following[followerId].insert(followeeId);
        }
    }
    void unfollow(int followerId, int followeeId){
        following[followerId].erase(followeeId);
    }
};