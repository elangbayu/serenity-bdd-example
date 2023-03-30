package starter.helpers;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://linkedin.com")
public class LinkedInPage extends PageObject {
    public static Target USERNAME_FIELD = Target.the("username field").located(By.id("session_key"));
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.id("session_password"));
    public static Target SIGN_IN_BUTTON = Target.the("sign in button").locatedBy("//button[contains(text(),'Sign in')]");
    public static Target ERROR_EMAIL_LABEL = Target.the("error invalid email").located(By.id("error-for-username"));
}
