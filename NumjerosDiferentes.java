import java.util.Scanner;

public class NumjerosDiferentes {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Fala um número ai meu consagrado:");
	int numero1 = sc.nextInt();
	
	System.out.println("Fala outro número ai meu consagrado: ");
	int numero2 = sc.nextInt();
	
	if(numero1 > numero2 ) {
		System.out.println(numero1 + " é maior que " + numero2);
	}else {
		if(numero2 > numero1) {
			System.out.println(numero2 + " é amior que " + numero1);
		}else {
			System.out.println(" São iguais !!!");
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
