package ProgramacaoDeSistemas;

import java.util.Scanner;

public class Media {
	
	public static void main (String[] arggs) {
		
		Scanner input = new Scanner (System.in);
		double nota1, nota2, nota3 = 0, media;
		
		System.out.println("Nota1:");
		nota1 = input.nextDouble();
		
		System.out.println("Nota2:");
		nota2 = input.nextDouble();
		
		System.out.println("Nota3:");
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("Média: " + media);
		
		if (media < 3) {
			
			System.out.println("Reprovado");
			
		} else if (media < 7) {
			
			System.out.println("Exame");
			
		} else {
			
			System.out.println("Aprovado");
			
		}
	}
}