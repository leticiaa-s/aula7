package aula7;

import java.util.Scanner;

public class executora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Delta delta = new Delta();
        EqXn x = new EqXn();

        System.out.println("Considere a Equação: Ax^2 Bx C = 0 informe os valores.");
        System.out.println("Informe o valor de A:");
        delta.setA(entrada.nextDouble());
        System.out.println("Informe o valor de B:");
        delta.setB(entrada.nextDouble());
        System.out.println("Informe o valor de C:");
        delta.setC(entrada.nextDouble());
        delta.calculaDelta();
        System.out.println("Resultado:");
        System.out.println("Delta = " + delta.getDelta());
        if(delta.getDelta() < 0) {
            System.out.println("Delta negativo - Não é possível calcular sua raiz");
        }else{
            System.out.println("X'= " + x.calculaXn(delta));
            System.out.println("X''= " + x.calculaXp(delta));
        }
    }
}
