package stack;

import stack.MyStack;

public class TestMyStack {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(66);
        stack.push(77);
        stack.push(88);
        stack.push(99);
        Object pop = stack.pop();
        System.out.println("====:"+pop);
    }

}
