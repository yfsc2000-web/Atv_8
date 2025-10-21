package Atv13_Flowgrithm_para_intellij;

import java.util.Scanner;

public class Exercicio_09 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de material que há na impressora:");
        int material =sc.nextInt();

        if (material >0) {
            System.out.println("Impressão iniciada");
        }
        else {
            System.out.println("Sem material disponivel");
        }
    }
}
