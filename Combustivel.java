import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Fala a gasolina que tu quer man: ");
	String conbustivel = sc.nextLine();
	
	System.out.println("fala a capacidade do tanque ai meu mano:");
	double capacidadeTanque = sc.nextDouble();
	double valorPago;
	
	
	
	if (conbustivel.equalsIgnoreCase ("G")) {
		valorPago = capacidadeTanque * 3.79;
		System.out.println("O valor pago na gasolina: "+ valorPago);
	}
	else {
		valorPago = capacidadeTanque * 2.90;
		System.out.println("o valor pago no alcool: " + valorPago);
	}
	
	System.out.println(valorPago);
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
