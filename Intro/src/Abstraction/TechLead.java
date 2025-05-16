package Abstraction;

public class TechLead extends ManagerRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TechLead tl = new TechLead();
		ManagerRules mr = new TechLead();
		tl.Attendance();
		tl.Timekeep();
		tl.Ratings();
		mr.Timekeep();
		
	}
	public void Timekeep()
	{
		System.out.println("Oops");
	
	}
	@Override
	public void Ratings() {
		// TODO Auto-generated method stub
		System.out.println("Its confidential");
	}

	
}
