import java.util.Optional;
import java.util.stream.Stream;

public class Ques2 {
    public static void main(String[] args) {
        String ans = "pawan";
        Optional<String> op = Optional.ofNullable(ans);
        System.out.println(op.isPresent());

        //converting Optional to Stream
        Stream<String> strStream = op.stream();
        System.out.println(strStream);

        System.out.println(strStream.anyMatch(s->s.startsWith("p")));
    }
}
