package com.mycompany.temperaturaconverter;

import javax.swing.JOptionPane;

/**
 *
 * @author Laura Monsalve
 */
public class TemperaturaConverter {

    public static void main(String[] args) {
        double gradoC;
        double gradoF;
        double conversionCaF;
        double conversionFaC;
        
        gradoC= Double.parseDouble(JOptionPane.showInputDialog("Ingrse la temperatura en Grados Celsius"));
        conversionCaF= gradoC * 1.8 +32;
        JOptionPane.showMessageDialog(null, gradoC + "en grados °F es" + conversionCaF);
        
        gradoF= Double.parseDouble(JOptionPane.showInputDialog("Ingrse la temperatura en Grados Fahrenheit")); 
        conversionFaC= (gradoF-32)/1.8;
        JOptionPane.showMessageDialog(null, gradoF + "en grados °C es" + conversionFaC);
    }
}
