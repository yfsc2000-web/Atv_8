package Ativ13_Flowgorithm_para_Intellij;

import java.util.Scanner;

public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a temperatura?");
        int temperatura = sc.nextInt();

        if (temperatura > 80) {
            System.out.println("Alerta: Máquina desligada por superaquecimento");
        } else {
            System.out.println("Máquina operando normalmente");
        }
    }
}
