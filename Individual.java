
public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		// TODO Auto-generated constructor stub
	}

	public Individual(String name, Double anuallcome, Double healthExpenditures) {
		super(name, anuallcome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	public double tax() {

		double basictax;

		if (getAnuallcome() < 20000) {
			basictax = getAnuallcome() * 0.15;
		} else {
			basictax = getAnuallcome() * 0.25;
		}
		basictax = basictax - (getAnuallcome() * 0.5);

		if (basictax < 0.0) {
			basictax = 0.0;
		}
		return basictax;
	}

}
