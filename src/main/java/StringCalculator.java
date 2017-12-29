import java.util.Arrays;
import java.util.List;

public class StringCalculator {
    public int add(String input) {
        if (input.equals(""))
            return 0;

        List<String> strings = Arrays.asList(input.split(","));

        int sum = 0;
        for (String s : strings) {
            sum += Integer.parseInt(s);
        }

        return sum;
    }
}
