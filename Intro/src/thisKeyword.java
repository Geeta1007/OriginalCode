
public class thisKeyword {

	int a = 5;
	
	//this keyword refers to current object and the object scope lies in class level
	public void getdata()
	{
		int a = 10;
		int b = a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thisKeyword tk = new thisKeyword();
		tk.getdata();
		
	}

}
