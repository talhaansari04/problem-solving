import com.nab.problem.FindDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MainTest {
    @Test
    void testMaxAndMin() {
        FindDuplicate findDuplicate=new FindDuplicate();
        Integer max = findDuplicate.findMaxAndMin(List.of(12, 15, 16, 17));
        Assertions.assertEquals(17,max);
    }
}
