import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.checkArray(new Integer[]{null, 2, 3, null, 5, 6, null});
    }

    public void checkArray(Integer[] arr) {
        if (arr == null) {
            throw new IllegalStateException("Null pointer to array exception!");
        }
        if (arr.length == 0) {
            throw new IllegalStateException("Array is empty!");
        }

        List<Integer> nullIndexLst = new ArrayList<>();
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == null) {
                nullIndexLst.add(i);
            }
        }
        if (!nullIndexLst.isEmpty()) {
            StringBuilder nullIndexStr = new StringBuilder();
            for (int i = 0; i < nullIndexLst.size() - 1; i ++) {
                nullIndexStr.append(nullIndexLst.get(i));
                nullIndexStr.append(", ");
            }
            nullIndexStr.append(nullIndexLst.get(nullIndexLst.size() - 1));
            throw new IllegalStateException("Null pointer exception in this elements of array: " + nullIndexStr);
        }

        Logger log = Logger.getLogger(Main.class.getName());
        log.info("Array is OK");
    }
}