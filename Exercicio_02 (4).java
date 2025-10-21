package Ativ13_Flowgorithm_para_Intellij;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto há no estoque?");
        int estoque = sc.nextInt();

        if (estoque < 20) {
            System.out.println("Reabastecer imediatamente");
        }
        else {
            System.out.println("Estoque suficiente");
        }
    }
}
