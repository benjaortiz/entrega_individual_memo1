package cucumberSteps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MyStepdefs {

    @Given("person has a shield with {int} def")
    public void personHasAShieldWithDef(int defenseStat) {
        this.shield = new Shield(defenseStat);
        this.person = new Person(this.shield);

    }

    @When("person blocks an attack of {int}")
    public void personBlocksAnAttackOf(int attackDamage) {

        this.person.blockAttack(attackDamage);
    }

    @Then("person should have full hp")
    public void personShouldHaveFullHp() {
        assertTrue(this.person.hasFullHp());
    }


    private Person person;
    private Shield shield;

    @Then("person should have less than full hp")
    public void personShouldHaveLessThanFullHp() {

        assertFalse(this.person.hasFullHp());
    }

    @Then("person should have less than full hp and shield should be broken")
    public void personShouldHaveLessThanFullHpAndShieldShouldBeBroken() {

        assertFalse(this.person.hasFullHp());

        String expected= "Broken";
        assertEquals(expected , this.person.checkShieldStatus());
    }
}
