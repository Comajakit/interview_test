import org.example.solution.OddInt;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OddIntTest {

    @Test
    public void testSimpleCase() {
        System.out.println("=== Input [1, 2, 2, 3, 3] should return 1 ===");
        int[] input = {1, 2, 2, 3, 3};
        int result = OddInt.findOdd(input);
        System.out.println("result: " + result);
        assertEquals(1, result);
    }

    @Test
    public void testSingleElement() {
        System.out.println("=== Input [1] should return 1 ===");
        int[] input = {1};
        int result = OddInt.findOdd(input);
        System.out.println("result: " + result);
        assertEquals(1, result);
    }

    @Test
    public void testAllSameElementOddTimes() {
        System.out.println("=== Input [1, 1, 1, 1, 1] should return 1 ===");
        int[] input = {1, 1, 1, 1, 1};
        int result = OddInt.findOdd(input);
        System.out.println("result: " + result);
        assertEquals(1, result);
    }

    @Test
    public void testAllSameElementEvenTimes() {
        System.out.println("=== Input [1, 1, 1, 1] should return -1 ===");
        int[] input = {1, 1, 1, 1};
        int result = OddInt.findOdd(input);
        System.out.println("result: " + result);
        assertEquals(-1, result);
    }

    @Test
    public void testArrayWithOddOccurrenceNumber() {
        System.out.println("=== Input [1, 1, 2, 2, 2] should return 2 ===");
        int[] input = {1, 1, 2, 2, 2};
        int result = OddInt.findOdd(input);
        System.out.println("result: " + result);
        assertEquals(2, result);
    }


}
