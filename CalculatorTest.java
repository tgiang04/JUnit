import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertion.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testCong() {
        assertEquals(4, calculator.Cong(2, 2));
        assertEquals(-1, calculator.Cong(-2, 1));
    }

    @Test
    public void testTru() {
        assertEquals(3, calculator.Tru(5, 2));
        assertEquals(-4, calculator.Tru(-2, 2));
    }

    @Test
    public void testNhan() {
        assertEquals(4, calculator.Nhan(2, 2));
        assertEquals(-6, calculator.Nhan(-3, 2));
    }

    @Test
    public void testChia() {
        assertEquals(3, calculator.Chia(9, 3));
        assertEquals(-2, calculator.Chia(-10, 5));
    }

    @Test
    public void testChiaVoi0() {
        assertThrows(IllegalArgumentException.class, () -> calculator.Chia(4, 0));
    }
}