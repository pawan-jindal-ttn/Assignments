import java.util.Optional;

public class Ques4 {
    public static void main(String[] args) {
        String s = "TTN";
        Optional<String> optional = Optional.ofNullable(s);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
        System.out.println(optional.orElse("Null value"));
    }
}
