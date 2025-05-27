package JavaInterviewQuesAndAns;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseString {

	static String name = "Kishore Kumar";

	public void usingStringBuffer() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);

		System.out.println(buffer.reverse());
	}

	public void usingOwnLogic() {
		char[] charArray = name.toCharArray();
		String reversed = "";

		for (int i = charArray.length - 1; i >= 0; i--) {
			reversed = reversed + charArray[i];
		}

		System.out.println(reversed);
	}

	public void usingCollection() {
		char[] charArray = name.toCharArray();

		List list = new ArrayList<String>();
		list.add(charArray);
		ListIterator iterator = list.listIterator();
		String reversed = "";
		if (iterator.hasPrevious()) {
			reversed = reversed + iterator.previous();
		}
		System.out.println(reversed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseString reverseString = new ReverseString();
		reverseString.usingOwnLogic();
		reverseString.usingStringBuffer();

	}

}
