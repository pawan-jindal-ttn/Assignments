package Ques6;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=5; i++){
            list.add(i);
        }
        System.out.println("Original list is: " + list + "\n");

        list.addFirst(0);
        list.addLast(6);
        System.out.println("First and last elements added: " + list + "\n");


        list.removeFirst();
        list.removeLast();
        System.out.println("First and last elements removed: " + list + "\n");

        System.out.println("First element in the list is : " + list.getFirst());
        System.out.println("Last element in the list is : " + list.getLast() + "\n");
        System.out.println("List in Reverse order : " + list.reversed());
    }
}
