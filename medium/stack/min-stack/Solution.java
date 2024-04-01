class MinStack {

    class StackNode{
        public int val;
        public int minVal;

        public StackNode(int _val,int _minVal){
            val=_val;
            minVal=_minVal;
        }
    }
    Stack<StackNode> vals;
    int currentMin;
    public MinStack() {
        vals=new Stack<StackNode>();
    }

    public void push(int val) {
        if(vals.size()==0)
            currentMin=val;
        else{
            StackNode top = vals.peek();
            if(top.minVal>val)
                currentMin = val;
            else
                currentMin =top.minVal;
        }
        vals.push(new StackNode(val,currentMin));
    }

    public void pop() {
        vals.pop();
    }

    public int top() {
        return vals.peek().val;
    }

    public int getMin() {
        return vals.peek().minVal;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */