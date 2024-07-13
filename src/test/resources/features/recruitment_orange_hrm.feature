#language: es

@Regresion
Característica: Creación de contratación en OrangeHRM

  Yo como usuario quiero ingresar a OrangeHRM para realizar una contratacion

  Esquema del escenario: Iniciar sesion y realizar una nueva contratacion
    Dado que el Usuario ingresa a OrangeHRM
    Cuando inicio sesion con los datos de un usuario valido
      | usuario   | contrasenna   |
      | <usuario> | <contrasenna> |
    Y navego a la seccion Recruitment para luego dar clic en el botón +Add
    Y completo el formulario de contratacion con
      | nombre   | segundoNombre   | apellido   | email   | vacante   | numeroTelefonico   | palabraClave   | fecha_inicio   | notas   |
      | <nombre> | <segundoNombre> | <apellido> | <email> | <vacante> | <numeroTelefonico> | <palabraClave> | <fecha_inicio> | <notas> |
    Y guardo los detalles de la nueva contratacion
    Entonces verifico que la nueva contratacion se ha agregado correctamente
      | mensajeRegistro   | estadoAplicacion   | nombre   |
      | <mensajeRegistro> | <estadoAplicacion> | <nombre> |

    Ejemplos:
      | usuario | contrasenna | nombre | segundoNombre | apellido | email                   | vacante                  | numeroTelefonico | palabraClave        | fecha_inicio | notas  | mensajeRegistro | estadoAplicacion              |
      | Admin   | admin123    | Louisa | Andrea        | Perez    | louisafer2024@gmail.com | Junior Account Assistant | 3003019900       | Analista de Pruebas | 2000-19-07   | Junior |                 | Status: Application Initiated |
