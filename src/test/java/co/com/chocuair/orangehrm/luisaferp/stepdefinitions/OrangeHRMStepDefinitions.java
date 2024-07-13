package co.com.chocuair.orangehrm.luisaferp.stepdefinitions;

import co.com.choucair.orangehrm.luisaferp.tasks.AbrirTask;
import co.com.choucair.orangehrm.luisaferp.tasks.CargarDatosTask;
import co.com.choucair.orangehrm.luisaferp.tasks.IniciarSesionTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

public class OrangeHRMStepDefinitions {
    @Before
    public void iniciarSesion(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("que el Usuario ingresa a OrangeHRM")
    public void queElUsuarioIngresaAOrangeHRM() {
        OnStage.theActorCalled("Luisa").wasAbleTo(AbrirTask.paginaOrangeHrm());
    }

    @Cuando("inicio sesion con los datos de un usuario valido")
    public void inicioSesionConLosDatosDeUnUsuarioValido(List<Map<String, String>> testData) {
        OnStage.theActorInTheSpotlight().attemptsTo(CargarDatosTask.testData(testData.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo(IniciarSesionTask.usuarioRecruitment(testData.get(0)));
    }

    @Y("navego a la seccion Recruitment para luego dar clic en el botón +Add")
    public void navegoALaSeccionRecruitmentParaLuegoDarClicEnElBotónAdd() {
    }

    @Y("completo el formulario de contratacion con")
    public void completoElFormularioDeContratacionCon() {
    }

    @Y("guardo los detalles de la nueva contratacion")
    public void guardoLosDetallesDeLaNuevaContratacion() {
    }

    @Entonces("verifico que la nueva contratacion se ha agregado correctamente")
    public void verificoQueLaNuevaContratacionSeHaAgregadoCorrectamente() {
    }
}
