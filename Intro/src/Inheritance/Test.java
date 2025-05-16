package Inheritance;

import Abstraction.ChildAirbb;

public class Test {

	
	public void engine()
	{
		System.out.println("ABC child");
		
	}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Test tt = new Test();
			ChildAirbb pt = new ChildAirbb();
			pt.engine();
			tt.engine();
		}
	
		
}
