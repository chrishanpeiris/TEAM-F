	public class Loan{

		//changed access modifire and made it catch-call class
		private Loan(CapitalStrategy capitalStrategy, double commitment,
		int riskRating, Date maturity, Date expiry) {
			this(capitalStrategy, commitment, 0.00, riskRating, maturity, expiry);
		}
		//Change constructor into static creational method and rename createTermLoan
		public static Loan createTermLoan(double commitment, int riskRating, Date maturity) {
			return new Loan(commitment, 0.00, riskRating, maturity, null);
		}
		//Change constructor into static creational method and rename createTermLoan
		public static Loan createTermLoan(double commitment, int riskRating, Date maturity, Date expiry) {
			this(commitment, 0.00, riskRating, maturity, expiry);
		}
		//Change constructor into static creational method and rename CreateRTCL
		public static Loan CreateRTCL(double commitment, double outstanding,
		int customerRating, Date maturity, Date expiry) {
			this(null, commitment, outstanding, customerRating, maturity, expiry);
		}	
		//Change constructor into static creational method and rename CreateRTCL
		public static Loan CreateRTCL(CapitalStrategy capitalStrategy, double commitment,
		double outstanding, int riskRating,
		Date maturity, Date expiry) {
			this.commitment = commitment;
			this.outstanding = outstanding;
			this.riskRating = riskRating;
			this.maturity = maturity;
			this.expiry = expiry;
			this.capitalStrategy = capitalStrategy;
			if (capitalStrategy == null) {
				if (expiry == null)
				this.capitalStrategy = new CapitalStrategyTermLoan();
				else if (maturity == null)
				this.capitalStrategy = new CapitalStrategyRevolver();
				else
				this.capitalStrategy = new CapitalStrategyRCTL();
			}
		}
	}