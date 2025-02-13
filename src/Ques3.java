import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ques3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,4,5);
        Set<Integer> set = Set.of(10, 20, 30, 40);
        Map<String, Integer> mp = Map.of("s1", 100, "s2", 200);

        System.out.println(list);
        System.out.println(set);
        System.out.println(mp);
    }
}
