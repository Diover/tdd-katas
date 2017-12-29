import java.util.Arrays;

public class StringCalculator {

    private static final String delimeter = "[,\n]";

    public int add(String input) {
        if (input.equals(""))
            return 0;

        return Arrays.stream(input.split(delimeter)).mapToInt(Integer::parseInt).sum();
    }
}
