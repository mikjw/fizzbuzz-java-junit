public class FizzBuzz {
    public String output(int s) {
        String result = "";
        if (s % 3 == 0) {
            result += "Fizz";
        }
        if (s % 5 == 0) {
            result += "Buzz";
        }
        return result;
    }
}
