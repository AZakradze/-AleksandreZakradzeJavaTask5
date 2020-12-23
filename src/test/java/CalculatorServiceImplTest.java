import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorServiceImplTest {

    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        calculatorService = new CalculatorServiceImpl();
    }

    @Test
    public void sum() {
        double sum = 2 + 2;
        assertTrue(sum == calculatorService.sum(2, 2));
        double sum1 = 1000 + 2000;
        assertTrue(sum1 == calculatorService.sum(1000, 2000));
    }

    @Test
    public void prod() {
        double prod = 2 * 2;
        assertTrue(prod == calculatorService.prod(2, 2));
        double prod1 = 63 * 57;
        assertTrue(prod1 == calculatorService.prod(63, 57));
    }
}