package co.com.choucair.orangehrm.luisaferp.tasks;

import co.com.choucair.orangehrm.luisaferp.interactions.CargarDocumento;
import co.com.choucair.orangehrm.luisaferp.interactions.SeleccionarVacante;
import co.com.choucair.orangehrm.luisaferp.utils.MetodosUtilitarios;
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

public class LlenarFormularioTask implements Task {

    private final Map<String, String> testData;

    public LlenarFormularioTask(Map<String, String> testData) {
        this.testData = testData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(testData.get(NOMBRE)).into(TXT_NOMBRE),
                Enter.theValue(testData.get(SEGUNDO_NOMBRE)).into(TXT_SEGUNDO_NOMBRE),
                Enter.theValue(testData.get(APELLIDO)).into(TXT_APELLIDO),
                Click.on(BTN_VACANTE),
                SeleccionarVacante.opcion(testData.get(VACANTE)),
                Enter.theValue(testData.get(EMAIL)).into(TXT_CORREO),
                Enter.theValue(testData.get(NUMERO_TELEFONO)).into(TXT_NUMERO_TELEFONO),
                CargarDocumento.docPdfTxtWord(MetodosUtilitarios.rutaArchivo()),
                Enter.theValue(testData.get(PALABRA_CLAVE)).into(TXT_PALABRA_CLAVE),
                SendKeys.of(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE).into(TXT_FECHA_APLICACION),
                Enter.theValue(testData.get(FECHA_INICIO)).into(TXT_FECHA_APLICACION).thenHit(Keys.TAB),
                Enter.theValue(testData.get(NOTAS)).into(TXT_NOTAS),
                Click.on(CHBX_CONSENTIMIENTO)
        );
    }


    public static LlenarFormularioTask aspirante(Map<String, String> testData) {
        return Tasks.instrumented(LlenarFormularioTask.class, testData);
    }
}
