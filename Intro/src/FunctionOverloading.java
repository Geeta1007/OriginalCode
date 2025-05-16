import Abstraction.ChildAirbb;

public class FunctionOverloading  extends ChildAirbb{

	public void test(int a)
	{
		System.out.println(a);
	}
	public void test1(int a, int b)
	{
		System.out.println(b);
	}

	public void test(String a)
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloading fo = new FunctionOverloading();
		fo.test(5);
		fo.test("hello");
		fo.test1(5, 10);
		
	}

	
}
