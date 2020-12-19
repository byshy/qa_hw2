import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> testData = new ArrayList<>();
        testData.add(new ArrayList<>(Arrays.asList(-1, 2, 3, -4, 5, -6, 7)));
        testData.add(new ArrayList<>(Arrays.asList(-8, -9, 10, -11, 12, -13, 14)));
        testData.add(new ArrayList<>(Arrays.asList(15, 16, 17, 18, 19, -20, 21)));
        testData.add(new ArrayList<>(Arrays.asList(-22, 23, 24, -25, 26, -27, 28)));

        PositiveEvens positiveEvens = new PositiveEvens(testData);

        ArrayList<ArrayList<Integer>> positiveEvensResult = positiveEvens.getPositiveEvens();

        System.out.println(positiveEvensResult);
    }
}
