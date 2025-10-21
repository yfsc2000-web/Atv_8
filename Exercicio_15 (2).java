package Atv13_Flowgrithm_para_intellij;

import java.util.Scanner;

public class Exercicio_15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a pocentagem de peças aprovadas?");
        int aprovadas = sc.nextInt();

        if (aprovadas <90 ) {
            System.out.println("Qualidade abaixo do padrão");
        }
        else {
            System.out.println("Qualidade aceitável");
        }
    }
}
