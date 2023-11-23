import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" })
public class CucumberTest {

    @TestFactory
    public Stream<DynamicTest> runTests(Stream<DynamicTest> scenarios) {
        List<DynamicTest> tests = scenarios.collect(Collectors.toList());
        return tests.stream();
    }

}
