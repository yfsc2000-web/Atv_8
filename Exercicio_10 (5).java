package Atv13_Flowgrithm_para_intellij;

import java.util.Scanner;

public class Exercicio_10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso total de caixas:");
        int caixas = sc.nextInt();

        if (caixas >500) {
            System.out.println("Capacidade excedida");
        }
        else {
            System.out.println("Peso dentro do limite");
        }
    }
}
