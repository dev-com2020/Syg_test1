import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

import java.util.HashMap;

public class TestReporterTest {
    @Test
    void reportSingleVal(TestReporter testReporter){
        testReporter.publishEntry("key","value");
    }
    @Test
    void reportSeveralVal(TestReporter testReporter){
        HashMap<String, String> values = new HashMap<>();
        values.put("name","john");
        values.put("surname","doe");
        testReporter.publishEntry(values);
    }
}
