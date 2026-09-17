# Calculadora MVC

## Descripción

Aplicación de escritorio desarrollada en Java SE utilizando
el patrón arquitectónico MVC.

La aplicación permite realizar las operaciones aritméticas
básicas:

- Suma
- Resta
- Multiplicación
- División

También se implementaron pruebas unitarias automatizadas
utilizando JUnit 4.13.2.

## Tecnologías utilizadas

- Java SE
- Java Swing
- Maven
- JUnit 4.13.2
- IntelliJ IDEA Community Edition 2025.2.6.3
- DIA

## Arquitectura

El proyecto utiliza el patrón MVC:

### Model

La clase `Calculadora` contiene la lógica de las operaciones
matemáticas.

### View

La clase `CalculadoraView` contiene la interfaz gráfica.

### Controller

La clase `CalculadoraController` conecta la vista con el modelo.

### Main

La clase `Main` inicia la aplicación.

## Operaciones

La calculadora permite realizar:

```text
Suma
Resta
Multiplicación
División