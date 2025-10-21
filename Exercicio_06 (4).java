package Atv13_Flowgrithm_para_intellij;

import java.util.Scanner;

public class Exercicio_06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite como está a produção do turno:");
        int producao = sc.nextInt();

        if (producao >= 1000) {
            System.out.println("Meta atingida");
        }
        else {
            System.out.println("Produção abaixo da meta");
        }
    }
}
