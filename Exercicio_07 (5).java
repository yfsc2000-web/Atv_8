package Atv13_Flowgrithm_para_intellij;

import java.util.Scanner;

public class Exercicio_07 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de defeitos:");
        int defeitos = sc.nextInt();

        if (defeitos > 5) {
            System.out.println("Lote reprovado");
        }
        else
            System.out.println("Lote aprovado");
    }
}
