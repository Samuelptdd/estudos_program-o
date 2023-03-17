import java.util.Scanner;

public class Emprestimo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual teu nome man:");
		String nome = entrada.nextLine();
		
		System.out.println("Fala teu salario man:");
		double salario = entrada.nextDouble();
		
		double salariodesconto = (salario * 0.3);
		
		 System.out.println(" fala quanto tu quer man");
		double prestação = entrada.nextDouble();
		
		if( salariodesconto > prestação) {
			System.out.println(nome + "prestação autorizada !!");
		}
		else {
			System.out.println( nome + " prestação nao autorizada ;-;"); 
		}
		
		
		
		
		
		
		
		

	}

}
