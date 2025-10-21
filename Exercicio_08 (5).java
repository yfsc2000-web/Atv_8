package Atv13_Flowgrithm_para_intellij;

import java.util.Scanner;

public class Exercicio_08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nível de óleo da máquina:");
        int nivel = sc.nextInt();

        if (nivel < 30 ) {
            System.out.println("Adicionar óleo");
        }
        else {
            System.out.println("Nível adequado");
        }
    }
}
