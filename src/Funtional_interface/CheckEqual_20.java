package Funtional_interface;

import java.util.function.BiPredicate;

public class CheckEqual_20 {
	public class CheckEqualString_20 {
		public static void main(String[] args) {
			BiPredicate<String, String> check = (x,y) -> x.equalsIgnoreCase(y);
			
			System.out.println(check.test("hello", "HELLO"));
			
			
		}
	}
}

