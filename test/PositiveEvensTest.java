import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PositiveEvensTest {
    ArrayList<ArrayList<Integer>> testData = new ArrayList<>();

    @Test
    void standardOutput() {
        testData.add(new ArrayList<>(Arrays.asList(-1, 2, 3, -4, 5, -6, 7)));
        testData.add(new ArrayList<>(Arrays.asList(-8, -9, 10, -11, 12, -13, 14)));
        testData.add(new ArrayList<>(Arrays.asList(15, 16, 17, 18, 19, -20, 21)));
        testData.add(new ArrayList<>(Arrays.asList(-22, 23, 24, -25, 26, -27, 28)));

        PositiveEvens positiveEvens = new PositiveEvens(testData);

        ArrayList<ArrayList<Integer>> positiveEvensResult = positiveEvens.getPositiveEvens();

        ArrayList<ArrayList<Integer>> positiveEvensExpectedResult = new ArrayList<>();
        positiveEvensExpectedResult.add(new ArrayList<>(Collections.singletonList(2)));
        positiveEvensExpectedResult.add(new ArrayList<>(Arrays.asList(10, 12, 14)));
        positiveEvensExpectedResult.add(new ArrayList<>(Arrays.asList(16, 18)));
        positiveEvensExpectedResult.add(new ArrayList<>(Arrays.asList(24, 26, 28)));

        assertEquals(positiveEvensExpectedResult, positiveEvensResult);
    }

    @Test
    void whenEmptyListAsInput() {
        PositiveEvens positiveEvens = new PositiveEvens(testData);

        ArrayList<ArrayList<Integer>> positiveEvensResult = positiveEvens.getPositiveEvens();

        ArrayList<ArrayList<Integer>> positiveEvensExpectedResult = new ArrayList<>();

        assertEquals(positiveEvensExpectedResult, positiveEvensResult);
    }

    @Test
    void whenNullListAsInput() {
        PositiveEvens positiveEvens = new PositiveEvens(null);

        assertNull(positiveEvens.getPositiveEvens());
    }

    @Test
    void isPositive() {
        MathChecker mathChecker = mock(MathChecker.class);
        when(mathChecker.isPass()).thenReturn(false);
        assertFalse(mathChecker.isPass());
    }
}