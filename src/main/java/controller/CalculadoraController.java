package com.calculadora.controller;

import com.calculadora.model.Calculadora;
import com.calculadora.view.CalculadoraView;

public class CalculadoraController {

    private Calculadora modelo;
    private CalculadoraView vista;

    public CalculadoraController(
            Calculadora modelo,
            CalculadoraView vista) {

        this.modelo = modelo;
        this.vista = vista;

        configurarEventos();
    }

    private void configurarEventos() {

        vista.getBotonSumar()
                .addActionListener(e -> realizarSuma());

        vista.getBotonRestar()
                .addActionListener(e -> realizarResta());

        vista.getBotonMultiplicar()
                .addActionListener(e -> realizarMultiplicacion());

        vista.getBotonDividir()
                .addActionListener(e -> realizarDivision());
    }

    private double obtenerNumero1() {

        return Double.parseDouble(
                vista.getCampoNumero1().getText()
        );
    }

    private double obtenerNumero2() {

        return Double.parseDouble(
                vista.getCampoNumero2().getText()
        );
    }

    private void realizarSuma() {

        try {

            double numero1 = obtenerNumero1();
            double numero2 = obtenerNumero2();

            double resultado =
                    modelo.sumar(numero1, numero2);

            vista.mostrarResultado(resultado);

        } catch (NumberFormatException e) {

            vista.mostrarError(
                    "Ingrese números válidos."
            );
        }
    }

    private void realizarResta() {

        try {

            double numero1 = obtenerNumero1();
            double numero2 = obtenerNumero2();

            double resultado =
                    modelo.restar(numero1, numero2);

            vista.mostrarResultado(resultado);

        } catch (NumberFormatException e) {

            vista.mostrarError(
                    "Ingrese números válidos."
            );
        }
    }

    private void realizarMultiplicacion() {

        try {

            double numero1 = obtenerNumero1();
            double numero2 = obtenerNumero2();

            double resultado =
                    modelo.multiplicar(numero1, numero2);

            vista.mostrarResultado(resultado);

        } catch (NumberFormatException e) {

            vista.mostrarError(
                    "Ingrese números válidos."
            );
        }
    }

    private void realizarDivision() {

        try {

            double numero1 = obtenerNumero1();
            double numero2 = obtenerNumero2();

            double resultado =
                    modelo.dividir(numero1, numero2);

            vista.mostrarResultado(resultado);

        } catch (NumberFormatException e) {

            vista.mostrarError(
                    "Ingrese números válidos."
            );

        } catch (ArithmeticException e) {

            vista.mostrarError(
                    e.getMessage()
            );
        }
    }
}
