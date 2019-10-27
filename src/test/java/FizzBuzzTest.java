import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void testBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String out = fizzBuzz.output(3);

        Assert.assertThat(out, CoreMatchers.is("Fizz"));
    }

    @Test
    public void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String out = fizzBuzz.output(5);

        Assert.assertThat(out, CoreMatchers.is("Buzz"));
    }

    @Test
    public void testFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String out = fizzBuzz.output(45);

        Assert.assertThat(out, CoreMatchers.is("FizzBuzz"));
    }
}