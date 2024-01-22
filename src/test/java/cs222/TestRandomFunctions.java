package cs222;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRandomFunctions {
    @Test
    public void testIsEvenNumber(){
        RandomFunctions function = new RandomFunctions();
        boolean result = function.isEvenNumber(2);
        Assertions.assertTrue(result);
    }
    @Test
    public void testNotEvenNumber() {
        RandomFunctions function = new RandomFunctions();
        boolean result = function.isEvenNumber(12053);
        Assertions.assertFalse(result);
    }
    @Test
    public void testIsTenChar() {
        RandomFunctions function = new RandomFunctions();
        boolean result = function.isAtLeastTenChar("Switzerland");
        Assertions.assertTrue(result);
    }
    @Test
    public void testNotTenChar() {
        RandomFunctions function = new RandomFunctions();
        boolean result = function.isAtLeastTenChar("Hi");
        Assertions.assertFalse(result);
    }
}
