package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author :huayanjun
 * @Data: 2019/9/2 8:40
 * leetcode:225
 */
public class MyStack {

    private Queue<Integer> myQueue=new PriorityQueue();


    /** Initialize your data structure here. */
    public MyStack() {


    }

    /** Push element x onto stack. */
    public void push(int x) {
        myQueue.add(x);

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> temp =new PriorityQueue();
        while (myQueue.size()>1){
            temp.add(myQueue.poll());
        }
        int i=myQueue.poll();
        myQueue=temp;
        return i;
    }

    /** Get the top element. */
    public int top() {
        Queue<Integer> temp =new PriorityQueue();
        while (myQueue.size()>1){
            temp.add(myQueue.poll());
        }
        int i=myQueue.poll();
        temp.add(i);
        myQueue=temp;
        return i;

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return myQueue.size()==0;

    }
}
