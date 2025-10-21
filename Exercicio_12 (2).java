package Atv13_Flowgrithm_para_intellij;

import java.util.Scanner;

public class Exercicio_12 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a porcentagem de de eficiência:");
        int porcentagem = sc.nextInt();

        if (porcentagem >= 85) {
            System.out.println("Eficiência aceitável");
        }
        else {
            System.out.println("Manutenção recomendada");
        }
    }
}
