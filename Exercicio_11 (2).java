package Atv13_Flowgrithm_para_intellij;

import java.util.Scanner;

public class Exercicio_11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O sensor detectou operador na linha? (sim/nao):?");
        String resposta = sc.nextLine();

        if (resposta.equals("sim")) {
            System.out.println("Pausar linha de produção");
        }
        else {
            System.out.println("Linha operando normalmente");
        }
    }
}
