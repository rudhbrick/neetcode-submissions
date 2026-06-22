class LRUCache {
    struct Node {
        int key, val;
        Node* prev;
        Node* next;
        Node(int k, int v){
            key=k;
            val=v;
            prev = nullptr;
            next = nullptr;
        }
    };
    int cap;
    unordered_map<int,Node*> mp;
    Node* head;
    Node* tail;
    void remove(Node* node){
        node->prev->next=node->next;
        node->next->prev=node->prev;
    }
    void insert(Node* node){
        Node* prev=tail->prev;
        node->prev=prev;
        node->next=tail;
        prev->next=node;
        tail->prev=node;
    }
public:
    LRUCache(int capacity) {
        cap=capacity;
        head=new Node(0, 0);
        tail=new Node(0, 0);
        head->next=tail;
        tail->prev=head;
    }
    int get(int key) {
        if(mp.find(key)==mp.end()){
            return -1;
        }
        Node* node=mp[key];
        remove(node);
        insert(node);
        return node->val;
    }
    void put(int key,int value) {
        if(mp.find(key) != mp.end()){
            Node* node=mp[key];
            node->val=value;
            remove(node);
            insert(node);
        }else{
            Node* node = new Node(key, value);
            mp[key] = node;
            insert(node);
        }
        if(mp.size() > cap){
            Node* lru=head->next;
            remove(lru);
            mp.erase(lru->key);
        }
    }
};