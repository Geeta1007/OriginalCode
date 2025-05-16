package Interface;


public class CanadaTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic A = new CanadaTraffic();
		CanadaTraffic C = new CanadaTraffic();
		ContinentalTraffic B = new CanadaTraffic();
		C.GreenGo();
		C.RedStop();
		C.YellowWait();
		C.walkonsymbol();
		A.GreenGo();
		A.RedStop();
		A.YellowWait();
		C.Trainsymbol();
		B.Trainsymbol();

	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go implementation");
		
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop implementation");
	}

	@Override
	public void YellowWait() {
		// TODO Auto-generated method stub
		System.out.println("Yellow Wait implementation");
		
	}
	public void walkonsymbol() {
		System.out.println("Walking");
	}

	@Override
	public void Trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Do wait");
	}
}