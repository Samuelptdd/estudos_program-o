import java.util.Scanner;

public class Revisão {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor inteiro: " );
		int valor1 = sc.nextInt();
		
		System.out.println("Informe outro valor inteiro: " );
		int valor2 = sc.nextInt();		
		
		int soma = valor1 + valor2;
		int subtracao = valor2 - valor1;
		int divisao = valor2 / valor1;
		int multiplicacao = valor1 * valor2;
		
		System.out.println("O resultado da soma é: " + soma);
		System.out.println( valor2 + valor1 + " esse é o resutado da adição");
		System.out.println("O resultado da soma é: " + (valor1 + valor2) );
		System.out.println("o resultado da multiplicação é: " + multiplicacao );
		System.out.println("O resultado da subtração é: " + subtracao);
		System.out.println("O valor da divisão é: " + divisao);
		
		
		
		
		
		
		
		
	}
	
	
	
}
