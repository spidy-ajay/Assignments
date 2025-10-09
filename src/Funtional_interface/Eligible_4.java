package Funtional_interface;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Eligible_4 {
	public static void main(String[] args) {
		Supplier<Integer> age = () -> {
			return 21;
		};

		Predicate<Integer> check = x -> x >= 18;

		if (check.test(age.get())) {
			System.out.println("Eligible");
		} else {
			System.out.println("Not Eligible");
		}

	}
}
