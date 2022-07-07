package co.com.mentoria.programacionfuncional;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> listaA = Arrays.asList(7.0, 2.0, 6.0, 3.0);
        List<Double> listaB = Arrays.asList(8.0, 9.0, 2.0, 5.0, 6.0);
        Calculadora calculadora = new Calculadora(listaA, listaB);
        System.out.println("El resultado de sumar es: " + calculadora.sumar());
        System.out.println("El resultado de restar es: " + calculadora.restar());
        System.out.println("El resultado de multiplicar es: " + calculadora.multiplicar());
        System.out.println("El resultado de dividir es: " + calculadora.dividir());
        System.out.println("El resultado de modulo es: " + calculadora.modulo());
        calculadora.usandoReduce();
    }

}