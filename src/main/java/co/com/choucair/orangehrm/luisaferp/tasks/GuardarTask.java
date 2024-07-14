package co.com.choucair.orangehrm.luisaferp.tasks;

import co.com.choucair.orangehrm.luisaferp.userinterfaces.OrangeHrmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GuardarTask implements Task{

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrangeHrmPage.BTN_GUARDAR)
        );
    }

    public static GuardarTask postulacion() {
        return Tasks.instrumented(GuardarTask.class);
    }


}
