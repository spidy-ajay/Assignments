package Funtional_interface;

import java.util.function.BiPredicate;

public class CheckDiv_21 {
	
		public static void main(String[] args) {
			BiPredicate<Integer, Integer> check = (x, y) -> x % y == 0;

			System.out.println(check.test(12, 2));
		}
	}


