# Automatización con Serenity BDD, Selenium y Java

Este proyecto muestro una automatización de prueba utilizando el framework Serenity BDD junto con Selenium y Java. El escenario de prueba cubre desde el inicio de sesión hasta el registro de un usuario que se postula para una vacante desde el módulo de reclutamiento de OrangeHRM.

## Requisitos

- JDK (Java Development Kit) 11 o superior
- Gradle
- Cualquier IDE compatible con Java (IntelliJ IDEA, etc.)

## Configuración del Proyecto

1. **Clonar el repositorio:**
   https://github.com/luisaferp/co.com.choucair.oragehrm.luisaferp.git

3. **Importar el proyecto:**

Abrir el IDE y selecciona la opción para importar este proyecto Gradle.
Navega hasta la ubicación donde clonaste el repositorio y selecciona el archivo build.gradle.

3. **Configurar las dependencias de Serenity BDD y Selenium:**

Asegúrate de tener configuradas las variables de entorno necesarias.

4. **Configurar el archivo de propiedades (serenity.properties):**

Crea un archivo serenity.properties en la ruta src/test/resources y configura las propiedades necesarias como la URL de la aplicación y el tipo de navegador.

5. **Ejecución de la Automatización**
   
Para ejecutar la automatización, puedes usar Gradle desde la línea de comandos o desde tu IDE.

Desde la línea de comandos:
**gradle clean test aggregate**

6. **Desde tu IDE:**
   
Ejecuta la clase de prueba RunnerTags

# Escenario de Prueba: Creación de contratación en OrangeHRM

## Objetivo
Como usuario de OrangeHRM, quiero ingresar al sistema para realizar una nueva contratación.

## Esquema del escenario: Iniciar sesión y realizar una nueva contratación

### Pasos del Escenario:

1. **Dado que** el Usuario ingresa a OrangeHRM
2. **Cuando** inicio sesión con los datos de un usuario válido:
   | usuario | contraseña |
   |---------|------------|
   | Admin   | admin123   |
3. **Y** navego a la sección Recruitment para luego dar clic en el botón +Add
4. **Y** completo el formulario de contratación con:
   | nombre   | segundoNombre | apellido | email                   | vacante                  | númeroTelefónico | palabraClave | fechaInicio | notas              |
   |----------|---------------|----------|-------------------------|--------------------------|------------------|--------------|-------------|--------------------|
   | Louisa   | Andrea        | Perez    | louisafer2024@gmail.com | Junior Account Assistant | 3003019900       | QA           | 2000-19-07  | Postulacion Junior |
5. **Y** guardo los detalles de la nueva contratación
6. **Entonces** verifico que la nueva contratación se ha agregado correctamente:
   | mensajeRegistro          | estadoAplicación             | nombre   |
   |--------------------------|------------------------------|----------|
   | <mensajeRegistro>        | <estadoAplicación>           | <nombre> |

### Ejemplos:
   - **Ejemplo 1:**
     | mensajeRegistro              | estadoAplicación            | nombre   |
     |------------------------------|-----------------------------|----------|
     |                              | Status: Application Initiated | Louisa   |

