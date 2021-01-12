package dsa_stack_queqe.exercises.reverse_string_stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        String string = "nguyenvantien";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++){
            stack.push(string.charAt(i));
        }

        System.out.println(stack.size());

        for (int j = 0; j < string.length() ; j++) {
            System.out.print(stack.pop());
        }
    }

}
