package ProgramacaoDeSistemas;

import java.util.Scanner;

public class SomaMediaFor {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);
        int numero, soma = 0;
        
        double media;
        System.out.println("Digite 10 números:");
        
        for (int i = 0;  i < 10; i++) {

            numero = input.nextInt();
            
            soma += numero;

        }

        media = (double) soma / 10;
            System.out.println ("Soma dos números digitados: " + soma);
            System.out.println ("Média dos números digitados: " + media);

    }

}