import java.util.Scanner;

public class Aulap3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Informe um valor: ");
		int x = entrada.nextInt(); 
	    int somaImpar = 0, cont = 0;

		while (x != -999) {

			if ((x % 3 == 0) && (x % 2 != 0)) {
				somaImpar = somaImpar + x;
			}
			System.out.println("Informe um valor ou - 999 para encerrar a tarefa.");
			x = entrada.nextInt();
		}

		System.out.println("A soma dos impares : " + somaImpar);

		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
