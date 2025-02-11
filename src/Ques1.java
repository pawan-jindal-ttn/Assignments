import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques1 {
    public static void main(String[] args) {
        //Consumer-No Output, we can use to modify,print data but cant return anything
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> consumer = i -> System.out.println(i);
        list.forEach(consumer);

        //Predicate-it returns t/f
        Predicate<Integer> predicate = num->(num>10);
        System.out.println(predicate.test(20));

        //Function interface
        Function<Integer, String> function = t -> t + " Multiplied by 2: " + t*2;
        System.out.println(function.apply(5));

        //Supplier-Just supplies no input
        Supplier<Double> supplier = ()-> Math.random();
        System.out.println(supplier.get());
    }
}