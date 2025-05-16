package Selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Gee");
		names.add("Kishu");
		names.add("Gowtham");
		names.add("Viyu");
		names.add("Ganesh");
		
		int count=0;
		
		for(int i =0;i<names.size();i++)
		{
			String name = names.get(i);
			
			if(name.startsWith("G"))
			{
				count++;
			}		
		}
		System.out.println(count);
		

	
//		print the names starting with G letter using stream--------------------------------------------------------
		long c = names.stream().filter(s->s.startsWith("G")).count();
		System.out.println(c);

		
		long d = Stream.of("Kishor", "Keerthi", "Mayu", "Kim", "Kia").filter(s->s.startsWith("K")).count();
		System.out.println(d);
		
//		print the name has length of more than 4 using stream---------------------------------------------------------
		names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>3).limit(1).forEach(s->System.out.println(s));

		
//		print all the names using stream----------------------------------------------------------------------------------
		names.stream().forEach(s->System.out.println(s));
	
//		Using StreamMap----------------------------------------------------------------------------------------------
		
//		Print names which ends with "u" with uppercase-----------------------------------------------------------------
		names.stream().filter(s->s.endsWith("u")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
//		Print names staring with "G" with uppercase and sorted----------------------------------------------------------
		List<String> nameOne = Arrays.asList("Kishor", "Keerthi", "Mayu", "Kim", "Zia");
		nameOne.stream().filter(s->s.startsWith("K")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("---------------------------------------------------------------------------------------------");
		List<String> nameTwo = Arrays.asList("Ram", "Ria", "Rini", "Janani", "John");
		
//		Merging two lists--------------------------------------------------------------------------------
		Stream<String> output = Stream.concat(nameOne.stream(), nameTwo.stream());
//		output.sorted().forEach(s->System.out.println(s));

		boolean flag = output.anyMatch(s->s.equalsIgnoreCase("janani"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
//		Using StreamCollect--------------------------------------------------------------------
		
		List<String> ls = Stream.of("Kishor", "Keerthi", "Mayu", "Kim", "Kia").filter(s->s.startsWith("K")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls);
		System.out.println(ls.get(2));

//		print unique numbers from the array and sort the array-----------------------------------------------------
		
		List<Integer> values = Arrays.asList(1,5,1,4,1,2,4,3,5,9,7);
		values.stream().distinct().forEach(s->System.out.println(s));
		values.stream().sorted().forEach(s->System.out.println(s));
		System.out.println("---------------------------------------------------------------------------------------------");
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> value = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println(value.get(3));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}