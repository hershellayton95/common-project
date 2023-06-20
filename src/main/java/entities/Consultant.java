package entities;

public class Consultant extends Person{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String computerKind;
	private double dailyPay;
	
	public Consultant() {
		super();
		super.setJob("counsultant");
	}

	public String getComputerKind() {
		return computerKind;
	}

	public void setComputerKind(String computerKind) {
		this.computerKind = computerKind;
	}
	

	public double getDailyPay() {
		return dailyPay;
	}

	public void setDailyPay(double dailyPay) {
		this.dailyPay = dailyPay;
	}

	@Override
	public String toString() {
		return "Consultant ["+ super.toString() + "computerKind=" + computerKind +"DailyPay"+dailyPay+ "]";
	}

	@Override
	public String toJson() {
		// TODO Auto-generated method stub
		return super.toJson()+",\"computerKind\":"+"\""+computerKind+"\""+",\"DayliPay\":"+"\""+dailyPay+"\"";
	}
	
}
