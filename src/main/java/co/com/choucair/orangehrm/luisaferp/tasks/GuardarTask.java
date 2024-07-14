package co.com.choucair.orangehrm.luisaferp.tasks;


import co.com.choucair.orangehrm.luisaferp.interactions.EsperaImplicita;
import co.com.choucair.orangehrm.luisaferp.userinterfaces.OrangeHrmPage;
import co.com.choucair.orangehrm.luisaferp.utils.ConstantesDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

import java.util.Map;
import static co.com.choucair.orangehrm.luisaferp.userinterfaces.OrangeHrmPage.*;
import static co.com.choucair.orangehrm.luisaferp.utils.ConstantesDatos.*;

public class GuardarTask implements Task{
    private final Map<String, String> testData;

    public GuardarTask(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_GUARDAR),
                Click.on(BTN_LISTA_CANDIDATOS),
                Click.on(BTN_GUARDAR),
                Click.on(BTN_LISTA_CANDIDATOS),
                Enter.theValue(testData.get(ENTREVISTA)).into(OrangeHrmPage.TXT_ENTREVISTA),
                Enter.theValue(testData.get(ENTREVISTADOR)).into(OrangeHrmPage.TXT_ENTREVISTADOR),
                EsperaImplicita.seg(1),
                SendKeys.of(Keys.DOWN, Keys.ENTER).into(TXT_ENTREVISTADOR),
                Enter.theValue(testData.get(FECHA_INICIO)).into(OrangeHrmPage.TXT_FECHA_ENTREVISTA),
                Click.on(BTN_GUARDAR),
                Click.on(BTN_PASSED),
                Click.on(BTN_GUARDAR),
                Click.on(BTN_OFFER_JOB),
                Click.on(BTN_GUARDAR),
                Click.on(BTN_PASSED),
                Click.on(BTN_GUARDAR),
                EsperaImplicita.seg(5),
                Click.on(BTN_RECRUITMENT)
        );
    }

    public static GuardarTask postulacion(Map<String, String> testData) {
        return Tasks.instrumented(GuardarTask.class, testData);
    }


}
