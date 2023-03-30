package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.helpers.DoAnAction;
import starter.helpers.LinkedInPage;
import starter.helpers.NavigateTo;

public class LinkedInStepDefinitions {

    Dotenv dotenv = Dotenv.load();

    @Given("{actor} is on linkedin landing page")
    public void userIsOnLinkedInLandingPage(Actor actor) {
        actor.wasAbleTo(NavigateTo.theLinkedInLandingPage());
    }

    @And("user input correct username")
    public void userInputCorrectUsername() {
    }

    @And("user input correct password")
    public void userInputCorrectPassword() {
    }

    @And("{actor} click login")
    public void userClickLogin(Actor actor) {
        actor.attemptsTo(DoAnAction.clickSignInButton());
    }

    @Then("user is on home page")
    public void userIsOnHomePage() {
    }

    @And("user input post")
    public void userInputPost() {
    }

    @And("user click send post")
    public void userClickSendPost() {
    }

    @Then("user see their post in their feed")
    public void userSeeTheirPostInTheirFeed() {
    }

    @And("user click comment button")
    public void userClickCommentButton() {
    }

    @And("user input comment")
    public void userInputComment() {
    }

    @And("user click send comment")
    public void userClickSendComment() {
    }

    @Then("user see their comment on their post")
    public void userSeeTheirCommentOnTheirPost() {
    }

    @And("user click repost")
    public void userClickRepost() {
    }

    @Then("user see their reposted post in their feed")
    public void userSeeTheirRepostedPostInTheirFeed() {
    }

    @And("user input post with photo")
    public void userInputPostWithPhoto() {
    }

    @And("user input post with video")
    public void userInputPostWithVideo() {
    }

    @And("user input post with event")
    public void userInputPostWithEvent() {
    }

    @And("user click like button")
    public void userClickLikeButton() {
    }

    @And("user choose like emoticon")
    public void userChooseLikeEmoticon() {
    }

    @Then("user see their post is liked")
    public void userSeeTheirPostIsLiked() {
    }

    @And("{actor} input incorrect username {string}")
    public void userInputIncorrectUsername(Actor actor, String username) {
        actor.attemptsTo(DoAnAction.fillUsernameFieldWithValue(dotenv.get(username)));
    }

    @And("{actor} input incorrect password {string}")
    public void userInputIncorrectPassword(Actor actor, String password) {
        actor.attemptsTo(DoAnAction.fillPasswordFieldWithValue(dotenv.get(password)));
    }

    @Then("{actor} cannot login and still on login page")
    public void userCannotLoginAndStillOnLoginPage(Actor actor) {
        actor.attemptsTo(Ensure.that(LinkedInPage.ERROR_EMAIL_LABEL).hasText("Please enter a valid email address."));
    }

    @And("{actor} choose random number {int}")
    public void userChooseRandomNumber(Actor actor, int number) {
        System.out.println("User chose number: " + number);
    }
}