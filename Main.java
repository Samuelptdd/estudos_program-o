import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Diga-me o número de taxPayers: ");
		int n = entrada.nextInt();

		List<TaxPayer> lists = new ArrayList<>();

		for (int i = 1; i <= n; n++) {

			System.out.println("Tax Payer #" + i + "Data: ");
			System.out.println("individual or company (i/c)? ");
			char type = entrada.next().charAt(0);
			System.out.println("Name: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			System.out.println("AnualIncome: ");
			double income = entrada.nextDouble();

			if (type == i) {
				System.out.println("Heealth Expenditures: ");
				double healthExpenditures = entrada.nextDouble();
				Individual individual = new Individual(name, income, healthExpenditures);
				lists.add(individual);

			} else {
				System.out.println(" Number of Employer: ");
				int numberOfEmployers = entrada.nextInt();
				lists.add(new Conpany(name, income, numberOfEmployers));

			}

		}

		double sum = 0.0;
		System.out.println();
		System.out.println(" TAXES PAID: ");
		for (TaxPayer tp : lists) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}

		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		entrada.close();

	}

}
