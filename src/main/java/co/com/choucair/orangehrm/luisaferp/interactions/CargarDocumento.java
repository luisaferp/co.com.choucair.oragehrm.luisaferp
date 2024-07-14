package co.com.choucair.orangehrm.luisaferp.interactions;

import co.com.choucair.orangehrm.luisaferp.userinterfaces.OrangeHrmPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CargarDocumento implements Interaction {

    private final String rutaDocumento;

    public CargarDocumento(String rutaDocumento) {
        this.rutaDocumento = rutaDocumento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrangeHrmPage.BTN_CARGAR_DOCUMENTO_PADRE),
                SendKeys.of(rutaDocumento).into(OrangeHrmPage.BTN_CARGAR_DOCUMENTO),
                EsperaImplicita.seg(3)

        );
    }

    public static CargarDocumento docPdfTxtWord(String rutaDocumento){
        return Instrumented.instanceOf(CargarDocumento.class).withProperties(rutaDocumento);
    }

}
