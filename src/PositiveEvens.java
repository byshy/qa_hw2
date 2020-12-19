import java.util.ArrayList;

public class PositiveEvens {
    ArrayList<ArrayList<Integer>> input2DList;

    public PositiveEvens(ArrayList<ArrayList<Integer>> input2DList) {
        this.input2DList = input2DList;
    }

    // 1
    ArrayList<ArrayList<Integer>> getPositiveEvens() {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (input2DList == null) {
            return null;
        }

        // 2
        if (!input2DList.isEmpty()) {
            // 3
            for (int i = 0; i < input2DList.size(); i++) {
                result.add(new ArrayList<>());
                // 4
                if (!input2DList.get(i).isEmpty()) {
                    // 5
                    for (int j = 0; j < input2DList.get(i).size(); j++) {
                        int temp = input2DList.get(i).get(j);
                        // 6
                        if (MathChecker.isEven(temp) && MathChecker.isPositive(temp)) {
                            result.get(i).add(temp);
                        }
                    }
                }
            }
        } else {
            System.out.println("Parent array is empty");
        }

        return result;
    }
}
