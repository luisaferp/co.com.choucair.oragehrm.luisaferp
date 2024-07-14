package co.com.choucair.orangehrm.luisaferp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OrangeHrmPage {
    public static final Target TXT_USUARIO = Target.the("Espacio para el Usuario").located(By.name("username"));
    public static final Target BTN_LOGIN = Target.the("Boton para ingresar").located(By.xpath("//button[@type='submit']"));
    public static final Target TXT_CONTRASENNA = Target.the("Espacio para la contraseña").located(By.xpath("//input[@placeholder='Password']"));
    public static final Target BTN_RECRUITMENT = Target.the("Opcion Recruitment").located(By.xpath("//span[contains(@class, 'oxd-main-menu-item--name') and text()='Recruitment']"));
    public static final Target BTN_ADD = Target.the("Opcion + ADD").located(By.xpath("//button[contains(@class, 'oxd-button--secondary') and contains(., 'Add')]"));
    public static final Target TXT_NOMBRE = Target.the("Espacio para el Nombre").located(By.name("firstName"));
    public static final Target TXT_SEGUNDO_NOMBRE = Target.the("Espacio para el segundo nombre").located(By.name("middleName"));
    public static final Target TXT_APELLIDO = Target.the("Espacio para el apellido").located(By.name("lastName"));
    public static final Target BTN_VACANTE = Target.the("Desplegar Vacantes").located(By.xpath("//div[@class='oxd-select-text-input' and text()='-- Select --']"));
    public static final Target TXT_CORREO = Target.the("Espacio para escribir el email").located(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']"));
    public static final Target TXT_NUMERO_TELEFONO = Target.the("Espacio para numero de telefono").located(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']"));
    public static final Target TXT_PALABRA_CLAVE = Target.the("Espacio para palabras claves").located(By.xpath("//input[contains(@class, 'oxd-input--active') and contains(@placeholder, 'comma seperated words')]"));
    public static final Target TXT_FECHA_APLICACION = Target.the("Espacio para la fecha de la aplicacion de la vacante").located(By.xpath("//div[@class='oxd-date-input']//input[@placeholder='yyyy-dd-mm']"));
    public static final Target TXT_NOTAS = Target.the("Espacio para notas").located(By.xpath("//textarea[@placeholder='Type here']"));
    public static final Target CHBX_CONSENTIMIENTO = Target.the("Aceptar consentimiento").located(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
    public static final Target BTN_GUARDAR = Target.the("Guardar Postulacion").located(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' and contains(text(), 'Save')]"));


}
