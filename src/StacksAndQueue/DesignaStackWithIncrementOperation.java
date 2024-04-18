package StacksAndQueue;

public class DesignaStackWithIncrementOperation {

}
class CustomStack {
    int [] stack;
    int size = -1;
    int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public void push(int x) {
        if(size<maxSize-1){
            stack[++size] = x;
        }
    }

    public int pop() {
        if(size==-1){
            return -1;
        }
        return stack[size--];
    }

    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k,maxSize);i++){
            stack[i] += val;
        }
    }
}