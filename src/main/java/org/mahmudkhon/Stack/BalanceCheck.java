package org.mahmudkhon.Stack;


import java.util.Stack;

public class BalanceCheck {
    public static void main(String[] args) {

        String input="()()()";
        String input2="())";

        Stack<Character>stack=new Stack<>();

        boolean isBalanced=true;

        for(int i=0;i<input2.length();i++){
            if(input2.charAt(i)=='('){
                stack.push('(');
            }
            else if(input2.charAt(i)==')'){
                if(stack.isEmpty()){
                    isBalanced =false;
                    break;
                }
                else{

                    stack.pop();
                }

            }
        }

        System.out.println(isBalanced);

        }
    }


