
public class ThreadPrincipal {
	
	public static void main (String[] args) {
		
		//instanciando uma Thread dentro do Main
		
		ClasseDaThread Thread1 = new ClasseDaThread();
		Thread1.start();
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Aula sobre Threads com Java");
			
		}
		
		ClasseDaThread Thread2 = new ClasseDaThread();
		Thread2.start();

	}

}
