class PrefixTree {
public:
    class TrieNode {
    public:
        TrieNode* children[26];
        bool isEnd;
        TrieNode() {
            isEnd = false;
            for(int i = 0; i < 26; i++){
                children[i] = nullptr;
            }
        }
    };
    TrieNode* root;
    PrefixTree() {
        root=new TrieNode();
    }
    void insert(string word) {
        TrieNode* current=root;
        for(char ch:word){
            int idx=ch - 'a';
            if(current->children[idx]==nullptr){
                current->children[idx]=new TrieNode();
            }
            current=current->children[idx];
        }
        current->isEnd=true;
    }
    bool search(string word) {
        TrieNode* current=root;
        for(char ch:word){
            int idx=ch-'a';
            if(current->children[idx]==nullptr) return false;
            current=current->children[idx];
        }
        return current->isEnd;
    }
    bool startsWith(string prefix) {
        TrieNode* current=root;
        for(char ch:prefix){
            int idx=ch-'a';
            if(current->children[idx]==nullptr) return false;
            current=current->children[idx];
        }
        return true;
    }
};