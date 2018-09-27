package quiz2;



public class CarPayment {
	private double CarCost;
	private double DownPayment;
	private double LengthofLoan;
	private double InterestRate;
	
	

	
	public CarPayment(double carCost, double downPayment, double lengthofLoan, double interestRate) {
		super();
		CarCost = carCost;
		DownPayment = downPayment;
		LengthofLoan = lengthofLoan;
		InterestRate = interestRate;
	}
	public void setCarCost(double carCost) {
		CarCost = carCost;
	}
	public double getCarCost() {
		return CarCost;
	}
	public double getDownPayment() {
		return DownPayment;
	}
	public void setDownPayment(double downPayment) {
		DownPayment = downPayment;
	}
	public double getLengthofLoan() {
		return LengthofLoan;
	}
	public void setLengthofLoan(double lengthofLoan) {
		LengthofLoan = lengthofLoan;
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	public  double monthlyPay() {
		double newcost= CarCost-DownPayment;
		double r=(InterestRate/12);
		double powe= Math.pow((1+r), LengthofLoan);
		double pay= newcost*((r*(powe))/((powe)-1));
		return pay;
		
	}
	public double totalInterestPay() {
		double newcost= CarCost-DownPayment;
		double r=(InterestRate/12);
		double powe= Math.pow((1+r), LengthofLoan);
		double pay= newcost*((r*(powe))/((powe)-1));
		
		
		double totalPay= pay*LengthofLoan;
		double iPay=totalPay-newcost;
		return iPay;
	}
}
