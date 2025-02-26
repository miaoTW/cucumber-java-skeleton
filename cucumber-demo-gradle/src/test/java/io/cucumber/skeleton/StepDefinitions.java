/*
 * Copyright © 2023 IBM Corporation. IBM retains ownership, copyrights, any title of this source code. IBM Confidential.
 */
package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour")
    public void i_wait_hour(Integer int1) {
      System.err.println("wait for " + int1 + " hour!");
    }

    @Then("my belly should {string}")
    public void my_belly_should(String string) {
      System.err.println("my belly " + string + " !!");
    }

}
