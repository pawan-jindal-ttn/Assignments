package Ques3;

public class Main {
    public static void main(String[] args) {
        SpecialStack stk = new SpecialStack();

        stk.push(5);
        stk.push(8);
        stk.push(4);
        stk.getMin();
        stk.push(6);
        stk.push(1);
        stk.getMin();
        stk.pop();
        stk.getMin();
        stk.push(7);
    }
}
