package dsa_stack_queqe.exercises.reverse_arr_interger_stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

     }
}
