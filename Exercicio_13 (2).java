package Atv13_Flowgrithm_para_intellij;

import java.util.Scanner;

public class Exercicio_13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é a energia?");
        int energia = sc.nextInt();


        if (energia < 200) {
            System.out.println("Acionar energia auxiliar");
        }
        else {
            System.out.println("Energia solar suficiente");
        }
    }
}
