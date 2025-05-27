package ExcelDataDriven;
import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		dataDriven d = new dataDriven();
		ArrayList a = d.getData("Delete profile");
		
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
	}

}
