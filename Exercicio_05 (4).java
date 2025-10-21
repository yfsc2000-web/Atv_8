package Ativ13_Flowgorithm_para_Intellij;

import java.util.Scanner;

public class Exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a velocidade?");
        int velocidade = sc.nextInt();

        if (velocidade > 120) {
            System.out.println("Mostrar reduzir velocidade imediatamente!");
        }
        else {
            System.out.println("Velocidade dentro do limite");
        }
    }
}
