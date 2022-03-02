package SistemasOPeracionais;  

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SomandoVetores {
	
	public static void main (String[] args ) throws InterruptedException, ExecutionException {
		System.out.println("Iniciando a Somatória dos Vetores...");
		int[] numeros = new int[100];
		
		Random aleatorio = new Random (System.currentTimeMillis());  
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Math.abs(aleatorio.nextInt()) % 99; 
				
		}
		System.out.println("Processo Finalizado com Sucesso");
		
		ExecutorService executador = Executors.newCachedThreadPool();
		List<Future<Integer>> futures = new ArrayList<>();
		
		System.out.println("Iniciando a execução dos Callables...");
		for (int i = 0; i < 100; i++) {			
			Future<Integer> resultado = executador.submit(new SomadorCallable(numeros, i * 100, (i+1) * 100));
			futures.add(resultado);
		
		}
		System.out.println("Callables executados...");
		
		System.out.println("Iniciando a soma...");
		int soma = 0;
		for (Future<Integer> resultado: futures) {
			
			soma += resultado.get();
		}
		System.out.println("Soma = " + soma);
	}
}
