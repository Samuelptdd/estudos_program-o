
public abstract class TaxPayer {

	protected String name;
	protected Double anuallcome;

	public TaxPayer() {
	}

	public TaxPayer(String name, Double anuallcome) {
		this.name = name;
		this.anuallcome = anuallcome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuallcome() {
		return anuallcome;
	}

	public void setAnuallcome(Double anuallcome) {
		this.anuallcome = anuallcome;
	}

	public abstract double tax();

}
