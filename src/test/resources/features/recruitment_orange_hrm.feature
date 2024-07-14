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
      | nombre   | segundoNombre   | apellido   | email   | vacante   | numeroTelefonico   | palabraClave   | fechaInicio   | notas   |
      | <nombre> | <segundoNombre> | <apellido> | <email> | <vacante> | <numeroTelefonico> | <palabraClave> | <fechaInicio> | <notas> |
    Y guardo los detalles de la nueva contratacion
      | entrevista   | entrevistador   | fechaInicio   |
      | <entrevista> | <entrevistador> | <fechaInicio> |
    Entonces verifico que la nueva contratacion se ha agregado correctamente
      | estado   |
      | <estado> |

    Ejemplos:
      | usuario | contrasenna | nombre | segundoNombre | apellido | email                   | vacante               | numeroTelefonico | palabraClave | fechaInicio | notas              | entrevista      | entrevistador  | estado |
      | Admin   | admin123    | Louisa | Andrea        | Perez    | louisafer2024@gmail.com | Payroll Administrator | 3003019900       | QA           | 2000-19-07  | Postulacion Junior | ChoucairTesting | Charles Carter | Hired  |
