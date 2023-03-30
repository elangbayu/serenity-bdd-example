package starter.helpers;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://sepulsa.com")
public class SepulsaPage extends PageObject {
    public static Target PULSA_BUTTON = Target.the("pulsa button").located(By.id("Pulsa"));
    public static Target NOMOR_HP_FIELD = Target.the("field nomor handphone").located(By.id("phone_number"));
    public static Target PULSA_5000 = Target.the("pulsa 5rb button").located(By.id("Indosat Rp5.000"));
    public static Target PULSA_10000 = Target.the("pulsa 10rb button").located(By.id("Indosat Rp10.000"));
    public static Target PULSA_12000 = Target.the("pulsa 12rb button").located(By.id("Indosat Ooredoo Rp 12.000"));
    public static Target TOTAL_PEMBAYARAN = Target.the("text total pembayaran").located(By.id("total_checkout"));
}
