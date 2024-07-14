package co.com.choucair.orangehrm.luisaferp.tasks;

import co.com.choucair.orangehrm.luisaferp.userinterfaces.OrangeHrmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class NavegarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OrangeHrmPage.BTN_RECRUITMENT),
                Click.on(OrangeHrmPage.BTN_ADD)
        );
    }

    public static NavegarTask buscarFormulario() {
        return Tasks.instrumented(NavegarTask.class);
    }
}
