package org.chrisferdev.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("ingrese un entero:");
        int divisor;

        try {
            divisor = Integer.parseInt(valor);
            int division = 10 / divisor;
            System.out.println(division);
        } catch(NumberFormatException nfe){
            System.out.println("Se detecto una excepción: ingrese un valor numérico: " + nfe.getMessage());
            main(args);
        }
        catch(ArithmeticException ae){
            System.out.println("Capturando la excepción en tiempo de ejecución:" + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con o sin excepción!");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!");
    }
}
