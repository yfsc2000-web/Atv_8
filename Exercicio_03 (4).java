package Ativ13_Flowgorithm_para_Intellij;

import java.util.Scanner;

public class Exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Energia do robô:");
        int energia = sc.nextInt();

        if (energia >= 50) {
            System.out.println("Robô iniciando a pintura");
        }
        else {
            System.out.println("Energia insuficiente.Recarregar");
        }
    }
}
