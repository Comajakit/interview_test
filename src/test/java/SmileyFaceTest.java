import org.example.solution.SmileyFace;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmileyFaceTest {
    @Test
    public void testValidSmileys() {
        System.out.println("=== Input with only valid smileys \":)\", \":-D\", \";-D\" should return 3 ===");
        String[] input = {":)", ":-D", ";-D"};
        int result = SmileyFace.countSmiley(input);
        System.out.println("result: " + result);
        assertEquals(3, result);
    }

    @Test
    public void testInvalidSmileys() {
        System.out.println("=== Input with invalid smileys \":(\", \";-P\" should return 0 ===");
        String[] input = {":(", ";-P"};
        int result = SmileyFace.countSmiley(input);
        System.out.println("result: " + result);
        assertEquals(0, result);
    }

    @Test
    public void testInvalidEyes() {
        System.out.println("=== Input with invalid eyes \"|)\", \"0-D\" should return 0 ===");
        String[] input = {"|(", "0-P"};
        int result = SmileyFace.countSmiley(input);
        System.out.println("result: " + result);
        assertEquals(0, result);
    }

    @Test
    public void testInvalidNose() {
        System.out.println("=== Input with invalid nose \":>D\", \";3)\" should return 0 ===");
        String[] input = {":>D", ";3)"};
        int result = SmileyFace.countSmiley(input);
        System.out.println("result: " + result);
        assertEquals(0, result);
    }

    @Test
    public void testMixedValidAndInvalidSmileys() {
        System.out.println("=== Mixed input with valid and invalid smileys \":)\", \":P\" should return 1 ===");
        String[] input = {":)", ":P"};
        int result = SmileyFace.countSmiley(input);
        System.out.println("result: " + result);
        assertEquals(1, result);
    }

    @Test
    public void testNoSmileys() {
        System.out.println("=== Input with no smileys should return 0 ===");
        String[] input = {"abc", "123"};
        int result = SmileyFace.countSmiley(input);
        System.out.println("result: " + result);
        assertEquals(0, result);
    }

    @Test
    public void testEmptyInput() {
        System.out.println("=== Empty input should return 0 ===");
        String[] input = {};
        int result = SmileyFace.countSmiley(input);
        System.out.println("result: " + result);
        assertEquals(0, result);
    }
}
