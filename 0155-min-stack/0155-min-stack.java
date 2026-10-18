class MinStack{
    Stack<Integer> st;
    Stack<Integer> minSt;
    public MinStack(){
        st=new Stack<>();
        minSt=new Stack<>();
    }
    public void push(int value){
        st.push(value);
        if(!minSt.isEmpty()){
            minSt.push(Math.min(value,minSt.peek()));
        }else{
            minSt.push(value);
        }
    }
    public void pop(){
        st.pop();
        minSt.pop();
    }
    public int top(){
        return st.peek();
    }
    public int getMin(){
        return minSt.peek();
    }
}