package tcrtrial;

public class FizzBuzz {
    public static String say(int i) {
        if(i % 3 == 0)
            return "fizz";

        if (i == 5 || i == 10)
            return "buzz";
        
        return String.valueOf(i);
    }
}
