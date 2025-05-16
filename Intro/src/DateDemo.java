import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("m, y, M, E, d, H, h, s, S, D, z, F");
		SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		
	}

}
