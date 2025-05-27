package JavaInterviewQuesAndAns;

public class SingleTryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int number1=0;
			int number2=3;
			int result=number2/number1;
			System.err.println(result);
			
		} catch (ArithmeticException e) {
			System.out.println("Dont divide a number by zero");
		}
		catch (NullPointerException e) {
			System.out.println("This is due to null pointer exception");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Expression is not accepted");
		}
	}

}
