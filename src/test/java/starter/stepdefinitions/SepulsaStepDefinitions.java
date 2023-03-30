package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.DoAnAction;
import starter.helpers.NavigateTo;
import starter.helpers.SepulsaPage;

public class SepulsaStepDefinitions {
    @Given("{actor} is on sepulsa home page")
    public void userIsOnSepulsaHomePage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSepulsaHomePage());
    }


    @And("{actor} click beli pulsa")
    public void userClickBeliPulsa(Actor actor) {
        actor.attemptsTo(DoAnAction.clickPulsaButton());
    }


    @And("{actor} input nomor handphone {string}")
    public void userInputNomorHandphone(Actor actor, String nomorHp) {
        actor.attemptsTo(DoAnAction.fillNomorHPWithValue(nomorHp));
    }

    @And("{actor} choose pulsa 5 ribu")
    public void userChoosePulsa5Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa5rb());
    }

    @And("{actor} choose pulsa 10 ribu")
    public void userChoosePulsa10Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa10rb());
    }

    @And("{actor} choose pulsa 12 ribu")
    public void userChoosePulsa12Ribu(Actor actor) {
        actor.attemptsTo(DoAnAction.choosePulsa12rb());
    }

    @Then("{actor} see {string} checkout page")
    public void userSeeCheckoutPage(Actor actor, String text) {
        actor.attemptsTo(Ensure.that(SepulsaPage.TOTAL_PEMBAYARAN).hasText(text));
    }
}
