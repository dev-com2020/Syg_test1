import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInterfaceTest implements TestLifecycleLogger, TimeExecutionLogger{

    @Test
    void isEqualValue(){
        assertEquals(1,1);
    }
}
