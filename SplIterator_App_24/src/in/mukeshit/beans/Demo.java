package in.mukeshit.beans;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Hyd", "Bangalore", "Pune", "Delhi");
		/*
		 * Iterator<String> iterator = cities.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next());
		 */
		cities.spliterator().forEachRemaining(name -> System.out.println(name));
	}
}