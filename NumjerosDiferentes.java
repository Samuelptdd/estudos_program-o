import java.util.Scanner;

public class NumjerosDiferentes {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Fala um n�mero ai meu consagrado:");
	int numero1 = sc.nextInt();
	
	System.out.println("Fala outro n�mero ai meu consagrado: ");
	int numero2 = sc.nextInt();
	
	if(numero1 > numero2 ) {
		System.out.println(numero1 + " � maior que " + numero2);
	}else {
		if(numero2 > numero1) {
			System.out.println(numero2 + " � amior que " + numero1);
		}else {
			System.out.println(" S�o iguais !!!");
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
