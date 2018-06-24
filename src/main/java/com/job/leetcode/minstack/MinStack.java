package com.job.leetcode.minstack;

import java.util.Comparator;
import java.util.Optional;
import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/min-stack/description/
 */
public class MinStack {

    private Stack<Integer> stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        this.stack = new Stack<>();
    }

    public void push(int x) {
        this.stack.push(x);
    }

    public void pop() {
        this.stack.pop();
    }

    public int top() {
        Integer pop = this.stack.pop();
        this.stack.push(pop);
        return pop;
    }

    public int getMin() {
        Optional<Integer> min = this.stack.stream().min(Comparator.comparingInt(item -> item));
        return min.orElse(0);
    }
}
