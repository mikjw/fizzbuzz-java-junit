public class FizzBuzz {
    public String output(int s) {
        String result = "";
        if (s % 15 == 0) {
            result = "FizzBuzz";
        } else if (s % 3 == 0) {
            result = "Fizz";
        } else if (s % 5 == 0) {
            result = "Buzz";
        }
        return result;
    }
}
