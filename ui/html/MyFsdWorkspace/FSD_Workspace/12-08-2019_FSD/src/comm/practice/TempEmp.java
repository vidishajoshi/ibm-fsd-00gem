package comm.practice;

public class TempEmp extends Employee {

private int rate;
	
	public TempEmp() {
		
	}
	
	public TempEmp(int sal) {
		super("2","Kim","shown","Security");
		this.rate=sal;
	}

	@Override
	protected String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+"salary: "+rate;
	}
	
	
}