package comm.practice;

public class AccountOne {
	private String accountName;
	private int amount;
	
	public AccountOne() {
		this.accountName=accountName;
		this.amount=amount;
	}
	
	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountOne other = (AccountOne) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
	
	
	

	

	public static void main(String[] args) {
		
		AccountOne ac= null;
		ac = new AccountOne();
		
		AccountOne act=null;
		act= new AccountOne();
	
		ac.setAccountName("Smith");
        ac.setAmount(908);
        
		act.setAccountName("John");
		act.setAmount(908);
		
		System.out.println("result is :" +ac.equals(act));
	}

}
