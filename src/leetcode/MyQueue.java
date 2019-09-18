package leetcode;

import java.util.Stack;

/**
 * @Author :huayanjun
 * @Data: 2019/9/1 14:31
 * leetcode:232
 */
public class MyQueue {

    private  Stack<Integer> stackIn;
    private  Stack<Integer> stackOut;

    /** Initialize your data structure here. */
    public MyQueue() {
        stackIn=new Stack<>();
        stackOut=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stackIn.empty()&&!stackOut.empty())
            stackIn=exch(stackOut);
        stackIn.push(x);

    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stackOut.empty())
            stackOut=exch(stackIn);
        return stackOut.pop();


    }

    /** Get the front element. */
    public int peek() {
        if(stackOut.empty())
            stackOut=exch(stackIn);
        return stackOut.peek();

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackIn.empty()&&stackOut.empty();

    }

    private Stack<Integer> exch(Stack<Integer> stack){
        if(stack.empty()){
           return null;
        }
        Stack stackOut = new Stack();
        while (!stack.empty()){
            stackOut.push(stack.pop());
        }

        return stackOut;
    }
}
