
class MinStack {
    Stack<Integer> stck=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        stck.push(val);
    }
    
    public void pop() {
        stck.pop();
    }
    
    public int top() {
        return stck.peek();
    }
    
    public int getMin() {
        return Collections.min(stck);
    }
}
