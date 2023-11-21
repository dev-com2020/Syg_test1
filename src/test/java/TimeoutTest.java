import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static java.time.Duration.ofMinutes;


public class TimeoutTest {

    @Test
    void timeoutNotExceeded() {
        assertTimeout(ofMinutes(2), () -> {
        });
    }

    @Test
    void timeoutExceeded() {
        assertTimeout(ofMillis(10), () -> {
            Thread.sleep(10);
        });
    }

    @Test
    void timeoutWithResult() {
        String result = assertTimeout(ofMinutes(1), () -> {
            return "a result";
        });
        assertEquals("a result", result);
    }

    @Test
    void timeoutNotExceedWithMethod() {
        String result = assertTimeout(ofMinutes(1),
            TimeoutTest::greeting);
        assertEquals("a result", result);
    }

    private static String greeting() {
        return "Hello, World!";
    }

}
