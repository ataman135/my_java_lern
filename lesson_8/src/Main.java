import java.lang.StringBuilder;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        boolean flag = true;

        for (Integer i : data) {
            if (i % 2 != 0) {
                flag = false;
                break;
            }
        }
    }
}
