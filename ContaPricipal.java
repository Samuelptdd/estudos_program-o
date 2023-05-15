import java.util.Scanner;

public class ContaPricipal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Conta conta;
		
		System.out.println("Enter account number: ");
		int number = entrada.nextInt();

		System.out.println("Enter account holder");
		entrada.nextLine();
		String titular = entrada.nextLine();

		System.out.println("you want to do a inicial deposit? (enter Y to yes, or enter N to no)");
		char resposta = entrada.next().toLowerCase().charAt(0);

		if (resposta == 'y') {
			System.out.println("Enter initial deposit value: ");
			double amount = entrada.nextDouble();
			conta = new Conta(number, titular, amount);
		} else {
			conta = new Conta(number, titular);
		}

		System.out.println("Dados bancarios: ");
		System.out.println(conta);
		System.out.println("");
		
		System.out.println("Enter the deposit value: ");
		conta.deposit(entrada.nextDouble());
		System.out.println("Atualized dados: ");
		System.out.println(conta);
		
		System.out.println("Enter the withdraw value: ");
		conta.withDraw(entrada.nextDouble());
		System.out.println("Atualized dados: ");
		System.out.println(conta);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
