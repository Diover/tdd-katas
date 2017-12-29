import org.testng.annotations.Test;

import java.util.Queue;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringCalculatorTest {
    @Test
    public void shouldReturnZeroOnEmptyString() {
        StringCalculator calculator = new StringCalculator();

        int result = calculator.add("");

        assertThat(result, is(0));
    }

    @Test
    public void shouldReturnOneNumber() {
        StringCalculator calculator = new StringCalculator();

        int result = calculator.add("3");
        
        assertThat(result, is(3));
    }
}
