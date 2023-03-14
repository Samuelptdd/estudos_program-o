package exercito;

import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("primeiro valor: ");
	int valor1 = entrada.nextInt();
	
	System.out.println("segundo valor: ");
	int valor2 = entrada.nextInt();
	
	int soma = valor1 + valor2;
	
	if(soma > 20){
		System.out.println(" o resultado:" + (soma + 5));
	}else {
		int valor = soma *8;
		System.out.println(" o resultado" + valor);
	}
	
	
	
	
	
		
	}
		
}