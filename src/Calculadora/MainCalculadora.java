package Calculadora;

import javax.swing.*;

public class MainCalculadora {
    public static void main(String[] args) {
        DatosCal calculadora = new DatosCal();

        calculadora.setMs1(Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el valor de la masa (en kg) del objeto que cuelga de la polea: (m1)")));
        calculadora.setMs2(Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el valor de la masa (en kg) del objeto que se encuentra sobre la superficie horizontal: (m2)")));
        calculadora.setM(Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el valor del coeficiente de fricción:")));

        JOptionPane.showMessageDialog(null, calculadora.displayResults());
    }
    }
