package entidades;

public class Company extends TaxPayer{
		private int numberOfEmployess;
		
		
		
		public Company(String name, Double anualIncome, int numberOfEmployess) {
			super(name, anualIncome);
			this.numberOfEmployess = numberOfEmployess;
		}

		public int getNumberOfEmployess() {
			return numberOfEmployess;
		}

		public void setNumberOfEmployess(int numberOfEmployess) {
			this.numberOfEmployess = numberOfEmployess;
		}
		public double tax() {
			if(this.getNumberOfEmployess() > 10) {
				return this.getAnualIncome() * 0.14;
			}else {
				return this.getAnualIncome() * 0.16;
			}
			
		}
}
