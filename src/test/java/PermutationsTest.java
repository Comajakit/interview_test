import org.example.solution.Permutations;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PermutationsTest {

    @Test
    public void testSingleCharacter() {
        System.out.println("=== Input \"a\" should return [a] ===");
        Set<String> result = Permutations.permutation("a");
        System.out.println("result: " + result);
        assertEquals(1, result.size());
        assertTrue(result.contains("a"));
    }

    @Test
    public void testTwoCharacters() {
        System.out.println("=== Input \"ab\" should return [ab,ba] ===");
        Set<String> result = Permutations.permutation("ab");
        System.out.println("result: " + result);
        assertEquals(2, result.size());
        assertTrue(result.contains("ab"));
        assertTrue(result.contains("ba"));
    }

    @Test
    public void testThreeCharacters() {
        System.out.println("=== Input \"abc\" should return [abc,acb,bac,bca,cab,cba] ===");
        Set<String> result = Permutations.permutation("abc");
        System.out.println("result: " + result);
        assertEquals(6, result.size());
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("acb"));
        assertTrue(result.contains("bac"));
        assertTrue(result.contains("bca"));
        assertTrue(result.contains("cab"));
        assertTrue(result.contains("cba"));
    }

    @Test
    public void testDuplicateCharacters() {
        System.out.println("=== Input \"aab\" should return [aab,aba,baa] ===");
        Set<String> result = Permutations.permutation("aab");
        System.out.println("result: " + result);
        assertEquals(3, result.size());
        assertTrue(result.contains("aab"));
        assertTrue(result.contains("aba"));
        assertTrue(result.contains("baa"));
    }

    @Test
    public void testAllSameCharacters() {
        System.out.println("=== Input \"aaa\" should return [aaa] ===");
        Set<String> result = Permutations.permutation("aaa");
        System.out.println("result: " + result);
        assertEquals(1, result.size());
        assertTrue(result.contains("aaa"));
    }

}
