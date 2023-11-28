package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyNewStepdefs {
    private Calculator calculator;
    private int value1;
    private int value2;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }
    @Given("^two input values, (\\d+) and (\\d+)$")
    public void twoInputValues(Integer a, Integer b) {
        value1 = a;
        value2 = b;
    }

    @When("^I get sqrt the two values fraction$")
    public void iGetSqrtTwoValuesFraction() {
        result = calculator.fract(value1, value2);
        System.out.print(result);
    }

    @Then("^I expect the result (\\d+)\\.(\\d+)$")
    public void iExpectResult(double arg0) {
        Assert.assertEquals(arg0, result);
    }
}
