package exercito;

import java.util.Scanner;

public class alistamento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua idade :");
		
		int idade = entrada.nextInt();
		
		if(idade >= 18) { 
			System.out.println("Samuel vai para o exercito !"); } 
		else {
				System.out.println("Samuel não vai para o exercito ;-;"); }

}

}
