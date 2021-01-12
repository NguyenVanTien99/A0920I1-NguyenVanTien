package dsa_stack_queqe.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.remove(1));

        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue.contains(3));

        System.out.println(queue);


    }
}
