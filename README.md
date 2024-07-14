# Automatización con Serenity BDD, Selenium y Java

En este proyecto se realiza una automatización de pruebas utilizando el framework Serenity BDD junto con Selenium y Java. El escenario de prueba abarca desde el inicio de sesión hasta el registro de un usuario que se postula para una vacante desde el módulo de reclutamiento de OrangeHRM.

## Requisitos

- JDK (Java Development Kit) 11 o superior
- Gradle
- Cualquier IDE compatible con Java (IntelliJ IDEA, etc.)

## Configuración del Proyecto

1. **Clonar el repositorio:**
   https://github.com/luisaferp/co.com.choucair.oragehrm.luisaferp.git

2. **Importar el proyecto:**
   Abre tu IDE y selecciona la opción para importar este proyecto Gradle.
   Navega hasta la ubicación donde clonaste el repositorio y selecciona el archivo `build.gradle`.

3. **Configurar las dependencias de Serenity BDD y Selenium:**
   Asegúrate de tener configuradas las variables de entorno necesarias.

4. **Configurar el archivo de propiedades (serenity.properties):**
   Crea un archivo `serenity.properties` en la raíz del proyecto y configura las propiedades necesarias como la URL de la aplicación y el tipo de navegador.

5. **Ejecución de la Automatización:**

   - Desde la línea de comandos:
     ```
     gradle clean test aggregate
     ```

   - Desde tu IDE:
     Ejecuta la clase de prueba `RunnerTags`.

## Escenario de Prueba

### Característica: Creación de contratación en OrangeHRM

Yo como usuario quiero ingresar a OrangeHRM para realizar una contratación.

#### Esquema del escenario: Iniciar sesión y realizar una nueva contratación

Dado que el Usuario ingresa a OrangeHRM  
Cuando inicio sesión con los datos de un usuario válido  
| usuario | contrasenna |
|---------|-------------|
| <usuario> | <contrasenna> |

Y navego a la sección Recruitment para luego dar clic en el botón +Add  
Y completo el formulario de contratación con  
| nombre | segundoNombre | apellido | email | vacante | numeroTelefonico | palabraClave | fechaInicio | notas |
|--------|--------------|----------|-------|---------|------------------|--------------|-------------|-------|
| <nombre> | <segundoNombre> | <apellido> | <email> | <vacante> | <numeroTelefonico> | <palabraClave> | <fechaInicio> | <notas> |

Y guardo los detalles de la nueva contratación  
| entrevista | entrevistador | fechaInicio |
|------------|---------------|-------------|
| <entrevista> | <entrevistador> | <fechaInicio> |

Entonces verifico que la nueva contratación se ha agregado correctamente  
| estado |
|--------|
| <estado> |

### Ejemplos:

| usuario | contrasenna | nombre | segundoNombre | apellido | email                   | vacante               | numeroTelefonico | palabraClave | fechaInicio | notas              | entrevista      | entrevistador  | estado |
|---------|-------------|--------|---------------|----------|-------------------------|-----------------------|------------------|--------------|-------------|--------------------|-----------------|----------------|--------|
| Admin   | admin123    | Louisa | Andrea        | Perez    | louisafer2024@gmail.com | Payroll Administrator | 3003019900       | QA           | 2000-19-07  | Postulacion Junior | ChoucairTesting | Charles Carter | Hired  |


# EVIDENCIA DEL TEST EJECUTADO:

![image](https://github.com/user-attachments/assets/6b8b96e9-41f3-4fa7-ba4b-ac42fbbbb731)
