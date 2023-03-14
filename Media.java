package exercito;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

	Scanner Samuel = new Scanner(System.in);
	
	System.out.println("Qual o seu nome: ");
	String nome = Samuel.nextLine();
	
	System.out.println("Primeira nota: ");
	double nota1 = Samuel.nextDouble();
	
	System.out.println("Segunda nota: ");
	double nota2 = Samuel.nextDouble();
	
	double media = (nota1 + nota2)/2;
		
	System.out.println("media" + media);	
		
	if(media >= 7) {
		System.out.println(nome + "aprovado");
		
	}else { 
		System.out.println(nome + "reprovado");
		}
	
	}
	
}
	


