import junit.framework.TestCase;
import org.junit.Test;

import java.util.Scanner;

public class first_exampleTest extends TestCase {
    @Test
    public void testSum() {
        first_example first_example = new first_example();
        String str="zcinitufxoldnokacdvtmdohsfdjepyfioyvclhmujiqwvmudbfjzxjfqqxjmoiyxrfsbvseawwoyynn";
        //String str="xiaodao";
        String actual = first_example.print(str.length(),str);
        String expected = "CHAT WITH HER!";
        assertEquals(expected, actual);
    }
}