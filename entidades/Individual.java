package entidades;

public class Individual extends TaxPayer {
		private double healthExpenditures;

		public Individual(String name, Double anualIncome, double healthExpenditures) {
			super(name, anualIncome);
			this.healthExpenditures = healthExpenditures;
		}

		public double getHealthExpenditures() {
			return healthExpenditures;
		}

		public void setHealthExpenditures(double healthExpenditures) {
			this.healthExpenditures = healthExpenditures;
		}
		@Override
		public double tax() {
			return (this.getAnualIncome() * 0.25) - (this.healthExpenditures * 0.5) ;
		}
}
