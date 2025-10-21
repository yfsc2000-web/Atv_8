package Ativ13_Flowgorithm_para_Intellij;

import java.util.Scanner;

public class Exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso:");
        int peso = sc.nextInt();

        if (peso >= 5) {
            System.out.println("Peça pesada");
        }
        else {
            System.out.println("Peça leve");
        }
    }
}
