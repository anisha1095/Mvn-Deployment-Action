import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hello {

    public static Integer getSum (List<Integer> a) {
        return a.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void main (String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        getSum(i);
        System.out.println("Hello World!!!");
    }
}
