package SistemasOperacionais;
import java.util.Scanner;

public class SomandoNovosVetores {
	
	public static void main (String[] args) {
		
		int[] posicaoA;
		int i;
		int soma = 0;
		int tamanho = 100;
		
		posicaoA = new int[tamanho];
					
		for (i = 0; i < tamanho; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Digite o " + (i + 1) + " primeiro valor: ");
			posicaoA[i] = scanner.nextInt(); 
					
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