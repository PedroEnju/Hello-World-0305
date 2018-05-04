package br.com.pedroenju;

import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {
        int numero = 0;
        Random ran = new Random();
        int meuIntAleatorio = ran.nextInt(100);
       
        System.out.println("Hello World!!!");
    }

}
