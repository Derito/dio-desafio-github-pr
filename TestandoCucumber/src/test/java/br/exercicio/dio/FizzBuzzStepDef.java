package br.exercicio.dio;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FizzBuzzStepDef {

    private int number;
    private String answer;

    @Given("the user selected the number {int}")
    public void selectNumber(int number){
        this.number = number;
    }
    @When("the user clicked the fizzbuzz button")
    public void fizzBuzz(){
        answer=FizzBuzz.render(number);
    }
    @Then("the program prints {word}")
    public void checkAnswer(String expected){
        Assert.assertEquals(expected, answer);
    }

}
