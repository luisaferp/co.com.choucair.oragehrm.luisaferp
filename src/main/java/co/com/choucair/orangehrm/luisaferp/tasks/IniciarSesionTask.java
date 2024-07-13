package co.com.choucair.orangehrm.luisaferp.tasks;

import co.com.choucair.orangehrm.luisaferp.userinterfaces.OrangeHrmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.Map;
import static co.com.choucair.orangehrm.luisaferp.utils.ConstantesDatos.*;

public class IniciarSesionTask implements Task {
    private final Map<String, String> testData;

    public IniciarSesionTask(Map<String, String> testData) {
        this.testData = testData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(testData.get(USUARIO)).into(OrangeHrmPage.TXT_USUARIO),
                Enter.theValue(testData.get(CONTRASENNA)).into(OrangeHrmPage.TXT_USUARIO)
        );
    }

    public static IniciarSesionTask usuarioRecruitment(Map<String, String> testData) {
        return Tasks.instrumented(IniciarSesionTask.class, testData);
    }

}