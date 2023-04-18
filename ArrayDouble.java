import java.util.Scanner;

public class ArrayDouble {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[4];
		int soma = 0 ;
		
		for (int i = 0; i <= 3; i++) {
			System.out.println("Informe uma nota : ");
			numeros[i] = entrada.nextInt();
			
		soma = soma + numeros[i];
			
			
			
		}
		
		
		
		double media = soma / 4;
		System.out.println(" A média he : " + media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
