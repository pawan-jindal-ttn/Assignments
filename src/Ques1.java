import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ques1 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.iterate(1, i-> i<=20, i->i*2);

        IntStream stream2 = IntStream.iterate(1,i->i<=20, i->i*2);

        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }
}
