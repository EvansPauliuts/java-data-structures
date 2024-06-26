package com.evanscode;

import java.util.List;
import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.empty());

        List<Integer> stack_l = new Stack<>();
        stack_l.add(1);
        stack_l.add(2);
        stack_l.add(3);

        System.out.println(stack_l.size());
    }
}
