package leetcode;

import java.util.Stack;

/**
 * @Author :huayanjun
 * @Data: 2019/9/3 9:03
 * leetcode:155
 */
public class MinStack {

    private Stack<Integer> storeStack;
    private Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        storeStack=new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        storeStack.push(x);
        if(minStack.empty()||x<=minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        int i=storeStack.pop();
        if(i==minStack.peek())
            minStack.pop();

    }

    public int top() {
        return storeStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
