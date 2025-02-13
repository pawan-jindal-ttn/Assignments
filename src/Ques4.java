import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ques4 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4);
        List<Integer> list = stream.collect(Collectors.toUnmodifiableList());
        System.out.println(list);
    }
}
