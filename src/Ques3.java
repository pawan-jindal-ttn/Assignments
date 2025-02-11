import java.util.ArrayList;

public class Ques3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<=10; i++){
            list.add(i);
        }

        int ans = list.stream().filter(a -> a>5).reduce(0, (a,b)->a+b);
        System.out.println(ans);
    }
}
