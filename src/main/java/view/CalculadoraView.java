package com.calculadora.view;

import javax.swing.*;
import java.awt.*;

public class CalculadoraView extends JFrame {

    private JTextField campoNumero1;
    private JTextField campoNumero2;

    private JButton botonSumar;
    private JButton botonRestar;
    private JButton botonMultiplicar;
    private JButton botonDividir;

    private JLabel resultado;

    public CalculadoraView() {

        setTitle("Calculadora MVC");

        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        crearComponentes();

        setVisible(true);
    }

    private void crearComponentes() {

        JPanel panel = new JPanel();

        panel.setLayout(new GridLayout(6, 2, 10, 10));

        JLabel etiquetaNumero1 =
                new JLabel("Número 1:");

        JLabel etiquetaNumero2 =
                new JLabel("Número 2:");

        campoNumero1 = new JTextField();

        campoNumero2 = new JTextField();

        botonSumar =
                new JButton("Sumar");

        botonRestar =
                new JButton("Restar");

        botonMultiplicar =
                new JButton("Multiplicar");

        botonDividir =
                new JButton("Dividir");

        resultado =
                new JLabel("Resultado: ");

        panel.add(etiquetaNumero1);
        panel.add(campoNumero1);

        panel.add(etiquetaNumero2);
        panel.add(campoNumero2);

        panel.add(botonSumar);
        panel.add(botonRestar);

        panel.add(botonMultiplicar);
        panel.add(botonDividir);

        panel.add(resultado);

        add(panel);
    }

    public JTextField getCampoNumero1() {
        return campoNumero1;
    }

    public JTextField getCampoNumero2() {
        return campoNumero2;
    }

    public JButton getBotonSumar() {
        return botonSumar;
    }

    public JButton getBotonRestar() {
        return botonRestar;
    }

    public JButton getBotonMultiplicar() {
        return botonMultiplicar;
    }

    public JButton getBotonDividir() {
        return botonDividir;
    }

    public void mostrarResultado(double resultado) {
        this.resultado.setText(
                "Resultado: " + resultado
        );
    }

    public void mostrarError(String mensaje) {

        JOptionPane.showMessageDialog(
                this,
                mensaje,
                "Error",
                JOptionPane.ERROR_MESSAGE
        );
    }
}
