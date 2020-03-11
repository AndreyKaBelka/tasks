import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MainTest extends Assert {
    private final Map<int[], Integer> taskData = new HashMap<>();
    private final Map<Integer, Integer> nextNumberData = new HashMap<>();


    @Before
    public void setUpData() {
        taskData.put(new int[]{1, 10}, 20);
        taskData.put(new int[]{100, 200}, 125);
        taskData.put(new int[]{201, 210}, 89);
        taskData.put(new int[]{900, 1000}, 174);

        nextNumberData.put(1, 4);
        nextNumberData.put(999, 2998);
        nextNumberData.put(956, 478);
        nextNumberData.put(32, 16);
    }

    @After
    public void tearDownData() {
        taskData.clear();
    }

    @Test
    public void getSequenceTest() {
        for (Map.Entry<int[], Integer> entry : taskData.entrySet()) {
            final int[] testData = entry.getKey();
            final int expected = entry.getValue();
            final int actual = Main.getSequence(testData[0], testData[1]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void sequenceNextNumberTest() {
        for (Map.Entry<Integer, Integer> entry : nextNumberData.entrySet()) {
            final int testData = entry.getKey();
            final int expected = entry.getValue();
            final int actual = Main.sequenceNextNum(testData);
            assertEquals(expected, actual);
        }
    }

}
