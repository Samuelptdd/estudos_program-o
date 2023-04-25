import java.util.Scanner;

public class TrianguloLados {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Insira os valores do triangulo x: ");
		System.out.println("Insira valor 1: ");
		x.a = entrada.nextInt();
		System.out.println("Insira valor 2: ");
		x.b = entrada.nextInt();
		System.out.println("Insira valor 3: ");
		x.c = entrada.nextInt();

		System.out.println("Insira os valores do triangulo y: ");
		System.out.println("Insira valor 1: ");
		y.a = entrada.nextInt();
		System.out.println("Insira valor 2: ");
		y.b = entrada.nextInt();
		System.out.println("Insira valor 3: ");
		y.c = entrada.nextInt();

		double px = (x.a + x.b + x.c) / 2;
		double areax = Math.sqrt(px * (px - x.a) * (px - x.b) * (px - x.c));

		double py = (y.a + y.b + y.c) / 2;
		double areay = Math.sqrt(py * (py - y.a) * (py - y.b) * (py - y.c));

		System.out.println("Area do TrianguloX: " + areax);
		System.out.println("Area do TrianguloY: " + areay);

		if (areax > areay) {
			System.out.println("O trianguloX é maior que o trianguloY");
		} else {
			System.out.println("O trianguloY é maior que o trianguloX");
		}

		entrada.close();

	}

}
