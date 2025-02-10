package Ques1;

import java.util.*;

public class CalSum {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<Double>(5);
        double sum = 0;

        list.add(1.5);
        list.add(12.5);
        list.add(10.5);
        list.add(20.5);
        list.add(15.5);

        Iterator<Double> it = list.iterator() ;

        while(it.hasNext()){
            sum += it.next();
        }

        System.out.println("Sum of all numbers is: " + sum);

    }
}
