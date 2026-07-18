class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> st;
        for(string token:tokens){
            if(token=="+"||token=="-"||token=="*"||token=="/"){
                int a=st.top();
                st.pop();
                int b=st.top();
                st.pop();
                switch(token[0]){
                    case '+':
                        st.push(a+b);
                        break;
                    case '-':
                        st.push(b-a);
                        break;
                    case '*':
                        st.push(a*b);
                        break;
                    case '/':
                        st.push(b/a);
                        break;
                }
            }else{
                int x=stoi(token);
                st.push(x);
            }
        }
        return st.top();
    }
};