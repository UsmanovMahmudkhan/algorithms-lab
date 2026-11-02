package org.mahmudkhon.Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";

        System.out.println(input);

        Stack<Character> strings = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            strings.push(input.charAt(i));
        }

        while(!strings.isEmpty()){
            System.out.print(strings.pop());
        }


    }

}
