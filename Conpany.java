
public class Conpany extends TaxPayer {

	private int NumberOfEmployers;

	public Conpany() {
		// TODO Auto-generated constructor stub
	}

	public Conpany(String name, Double anuallcome, int numberOfEmployers) {
		super(name, anuallcome);
		NumberOfEmployers = numberOfEmployers;
	}

	public int getNumberOfEmployers() {
		return NumberOfEmployers;
	}

	public void setNumberOfEmployers(int numberOfEmployers) {
		NumberOfEmployers = numberOfEmployers;
	}

	public double tax() {
		if (this.NumberOfEmployers > 10) {
			return getAnuallcome() * 0.14;
		} else {
			return getAnuallcome() * 0.16;
		}
	}

}
