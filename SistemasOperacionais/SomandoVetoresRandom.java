package SistemasOperacionais;
import java.util.Scanner;

public class SomandoVetoresRandom {
	
	public static void main (String[] args) {
		
		int[] posicaoA;
		int i;
		int soma = 0;
		int tamanho = 100;
		
		posicaoA = new int[tamanho];
				
		for (i = 0; i < tamanho; i++) {
			posicaoA[i] = (int) (1 + Math.random() * 100); 
					
		}
		
		for (i = 0; i < tamanho; i++) {
			soma = soma + posicaoA[i];
							
		}
		
		for (i = 0; i < tamanho; i++) {
			Scanner scanner = new Scanner (System.in);
			System.out.println("A[" + (i + 1) + "] = " + posicaoA[i]);
			
		}
		System.out.println("Soma: " + soma);
	}

}