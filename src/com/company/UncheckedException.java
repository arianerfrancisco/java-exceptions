package com.company;

import javax.swing.*;

public class UncheckedException {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showInputDialog(null, " Entrada Inválida, informe um número inteiro", e.getMessage());
            // evitar o e.getMessage() ao usuario
           // e.printStackTrace();
        } catch (ArithmeticException e) {

        } finally {
            System.out.println("Chegou ao finally");
        }
        System.out.println("Chegou até aqui");
    }
    public static int dividir(int a, int b) {
        return a / b;
    };
}
