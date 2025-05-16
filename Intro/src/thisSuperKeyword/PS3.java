package thisSuperKeyword;

import org.testng.annotations.Test;

public class PS3 {

	int a;
	public PS3(int a) {
		this.a=a;
	}
	@Test
	public int multiplyThree()
	{
		a=a*3;
		return a;
	}
}
