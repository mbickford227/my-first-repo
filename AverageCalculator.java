public class AverageCalculator {

    public double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }
}import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AverageCalculatorTest {

    @Test
    void testAverageOfPositiveNumbers() {
        AverageCalculator calculator = new AverageCalculator();
        int[] numbers = {10, 20, 30, 40, 50};

        double result = calculator.calculateAverage(numbers);

        assertEquals(30.0, result);
    }

    @Test
    void testAverageOfSingleNumber() {
        AverageCalculator calculator = new AverageCalculator();
        int[] numbers = {25};

        double result = calculator.calculateAverage(numbers);

        assertEquals(25.0, result);
    }

    @Test
    void testAverageOfMixedNumbers() {
        AverageCalculator calculator = new AverageCalculator();
        int[] numbers = {-10, 20, -30, 40};

        double result = calculator.calculateAverage(numbers);

        assertEquals(5.0, result);
    }

    @Test
    void testEmptyArrayThrowsException() {
        AverageCalculator calculator = new AverageCalculator();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.calculateAverage(new int[]{})
        );
    }

    @Test
    void testNullArrayThrowsException() {
        AverageCalculator calculator = new AverageCalculator();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculator.calculateAverage(null)
        );
    }
}