package tcrtrial;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
    @Test
    public void X() {
        assertEquals( "1", FizzBuzz.say(1));
        assertEquals( "2", FizzBuzz.say(2));
        assertEquals( "fizz", FizzBuzz.say(3));
    }
}
