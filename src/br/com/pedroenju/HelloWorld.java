package br.com.pedroenju;

import java.util.Random;
import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args) {
        int numero = 0;
        Random ran = new Random();
        int meuIntAleatorio = ran.nextInt(100);

        System.out.println("Hello World!!!");

//        JOptionPane.showMessageDialog(null, "Hello World! \r\nDefault");
//        JOptionPane.showMessageDialog(null, "Hello World!! \r\nQuestion", "Question Message", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello World!!! \r\nError", "Error Message", JOptionPane.ERROR_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Hello World!!!! \r\nWarning", "Warning Message", JOptionPane.WARNING_MESSAGE);
//        String entrada = JOptionPane.showInputDialog("Digite alguma coisa");
//        JOptionPane.showMessageDialog(null, entrada);
        try {
            int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Houve algum problema!");
        }

        try {
            float j = Float.parseFloat(JOptionPane.showInputDialog("Digite um flutuante"));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Houve algum problema!");
        }

//        String k = Integer.toString(i);
//        String l = Float.toString(j);
    }

}
