package StacksAndQueue;

import java.util.Stack;

public class ImplementQueueusingStacks {

}
class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int front;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        front = 0;
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack1.isEmpty()) front = x;
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(!stack2.isEmpty()) return stack2.peek();
        return front;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
