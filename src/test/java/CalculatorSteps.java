import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSteps {
    private Calculator calc;
    private int result;

    @Given("a calculator I just turned on")
    public void setup() {
        calc = new Calculator();
    }

    @When("I add {int} and {int}")
    public void add(int arg1, int arg2) {
        calc.push(arg1);
        calc.push(arg2);
        calc.push("+");
    }

    @Then("the result is {int}")
    public void theResultIs(double expectedResult) {
        assertEquals(expectedResult, calc.value());
    }

    @When("I substract {int} and {int}")
    public void iSubstractAnd(int arg0, int arg1) {
        calc.push(arg0);
        calc.push(arg1);
        calc.push("-");
    }
}
