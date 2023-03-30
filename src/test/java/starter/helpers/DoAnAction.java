package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DoAnAction {

    public static Performable fillUsernameFieldWithValue(String username) {
        return Task.where("{0} fill username field with " + username,
                Enter.theValue(username)
                        .into(LinkedInPage.USERNAME_FIELD)
        );
    }

    public static Performable fillPasswordFieldWithValue(String password) {
        return Task.where("{0} fill password field with " + password,
                Enter.theValue(password)
                        .into(LinkedInPage.PASSWORD_FIELD)
        );
    }

    public static Performable clickSignInButton() {
        return Task.where("{0} click sign in button",
                Click.on(LinkedInPage.SIGN_IN_BUTTON)
        );
    }

    public static Performable clickPulsaButton() {
        return Task.where("{0} click beli pulsa button",
                Click.on(SepulsaPage.PULSA_BUTTON)
        );
    }

    public static Performable fillNomorHPWithValue(String nomorHp) {
        return Task.where("{0} fill nominal pulsa with " + nomorHp,
                Enter.theValue(nomorHp)
                        .into(SepulsaPage.NOMOR_HP_FIELD)
        );
    }

    public static Performable choosePulsa5rb() {
        return Task.where("{0} choose pulsa 5rb",
                Click.on(SepulsaPage.PULSA_5000)
        );
    }

    public static Performable choosePulsa10rb() {
        return Task.where("{0} choose pulsa 10rb",
                Click.on(SepulsaPage.PULSA_10000)
        );
    }

    public static Performable choosePulsa12rb() {
        return Task.where("{0} choose pulsa 12rb",
                Click.on(SepulsaPage.PULSA_12000)
        );
    }
}
