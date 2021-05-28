import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void runTest () {
        List<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        Integer val = Hello.getSum(i);
        assertEquals(val, 10, 0);
    }
}
