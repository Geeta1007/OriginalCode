import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("mm/dd/yyyy, hh:mm:ss");
		System.out.println(cal.getTime());
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.SUNDAY));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.ZONE_OFFSET));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.ALL_STYLES));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
