import java.util.Scanner;

public class Atvdd {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int total = 0;
		
		int soma;

		do {
			

			System.out.println("informe um valor: ");
			int valor1 = entrada.nextInt();

			System.out.println("informe um outro valor: ");
			int valor2 = entrada.nextInt();

			System.out.println("Informe agora qual opera��o voc� quer que seja feita: ");
			String opera��o = entrada.next().toUpperCase();

			System.out.println("Caso queira parar digite -999, ou qualquer outro numero para continuar ");
			soma = entrada.nextInt();
			
			switch (opera��o) {

			case "A":
				total = valor1 + valor2;
				System.out.println("Vo�� escolheu Adi��o: " + total);
				break;

			case "S":
				total = valor1 - valor2;
				System.out.println("Vo�e escolheu Subtra��o: " + total);
				break;

			case "D":
				total = valor1 / valor2;
				System.out.println("Vo�� escolheu Divis�o: " + total);
				break;

			case "M":
				total = valor1 * valor2;
				System.out.println("Vo�� escolheu multiplica��o: " + total);
				break;
			default:
				System.out.println("Opera��o Invalida ");
			}

			if (total > 0) {
				System.out.println("Seu resultado � maior que zero: " + total);

				if (total % 2 == 0) {
					System.out.println("Seu resultado � par: " + total);
				} else {
					System.out.println("Seu resultado � impar: " + total);
				}

			} else if(total == 0){
				System.out.println("Seu resultado � igual a zero: " + total);
			}else {

				if (total % 2 == 0) {
					System.out.println("Seu resultado � par: " + total);
				} else {
					System.out.println("Seu resultado � impar: " + total);
				}

				System.out.println("Seu resultado � menor que zero: " + total);
			}

		} while (soma != -999);
		System.out.println("Seu programa acaba aqui!!!!");

		entrada.close();
	}

}
