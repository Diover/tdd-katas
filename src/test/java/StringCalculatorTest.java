import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringCalculatorTest {
    private StringCalculator createStringCalculator() {
        return new StringCalculator();
    }

    @Test
    public void shouldReturnZeroOnEmptyString() {
        StringCalculator calculator = createStringCalculator();

        int result = calculator.add("");

        assertThat(result, is(0));
    }

    @Test
    public void shouldReturnOneNumber() {
        StringCalculator calculator = createStringCalculator();

        int result = calculator.add("3");

        assertThat(result, is(3));
    }

    @Test
    public void shouldAddTwoNumbers() {
        StringCalculator calculator = createStringCalculator();

        int result = calculator.add("3,2");

        assertThat(result, is(3 + 2));
    }
    @Test
    public void shouldAddAlotOfNubmers() {


        StringCalculator calculator= createStringCalculator();
        int result=calculator.add("3,4,8");
        assertThat(result,is(3+4+8));

    }
}
