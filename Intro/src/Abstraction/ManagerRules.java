package Abstraction;

public abstract class ManagerRules {

	public void Timekeep()
	{
		System.out.println("Everyone should be on time");
	
	}
	public void Attendance()
	{
		System.out.println("Everyone should have 90%+ attendance");
	}
	public abstract void Ratings();
}
