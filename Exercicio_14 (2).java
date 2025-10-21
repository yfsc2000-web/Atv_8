package Atv13_Flowgrithm_para_intellij;

import java.util.Scanner;

public class Exercicio_14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas peças montadas?");
        int pecas = sc.nextInt();

        if (pecas == 0) {
            System.out.println("Erro. Verificar robô");
        }
        else {
            System.out.println("Montagem em andamento");
        }
    }
}
