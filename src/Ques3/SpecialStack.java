package Ques3;

import java.util.Stack;

//brute force
//time o(n)
//space o(n)
//        use a stack, pop all stack elements into min tracking stack, we will get min
//        and then throw back from min tacking stack to stack

//better approach
//time o(1)
//space o(n)
//        using a stack only, but now storing only min ones in stack
//        and print top element of "min tacking stack"

//best approach: encrypting and decrypting
//time o(1)
//space o(1)
//         pushing: encrypting the push when incoming element is smaller than min element
//                  pushing 2*(incoming element) - min element
//         popping: decrypting to get last min element
//                  element at the top = 2*(decrypted element) - min element
//                  we know element at the top and min element, therefore we can calculate decrypted element

public class SpecialStack {
    Stack<Integer>stack;
    Integer minElement;

    SpecialStack(){
        stack = new Stack<>();
        minElement = null;
    }

    void getMin(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Minimum element is: " + minElement);
        }
    }

    void push(Integer x){
        if (stack.isEmpty()) {
            minElement = x;
            stack.push(x);
            return;
        }
        if(x<minElement){
            stack.push(2*x-minElement);
            minElement = x;
        }
        else{
            stack.push(x);
        }
    }

    void pop(){
        if (stack.isEmpty()) {
            System.out.println("Stack is empty ");
            return;
        }
        Integer curr = stack.pop();
        if(curr<minElement){
            minElement = 2*minElement-curr;
        }
    }

    Boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }

    Boolean isFull(){
        if(stack.size() == stack.capacity()){
            return true;
        }
        return false;
    }
}
