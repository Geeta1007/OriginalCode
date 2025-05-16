package JavaInterviewQuesAndAns;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// FibonacciSeries --> 0 1 1 2 3 5 8 13 21 34 
		int limit = 10;
		
		int first=0, second=1;
		
		System.out.print("Fibonacci Series up to "+limit+ ": ");
		
		for(int i=0; i<limit; i++) {
			System.out.print(first+ " ");
			
			int next = first + second; //1 2 3 5 
			first = second; //1 1 2 3
			second = next; //1 2 3 5 
			//1 1 2 
		}
	}
}
