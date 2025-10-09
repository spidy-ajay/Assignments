package Funtional_interface;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PositiveNumber_1 {
	public static void main(String[] args) {
		Supplier<Integer> num = () -> 5;

		Predicate<Integer> check = x -> x >= 0;

		Consumer<Integer> print = x -> System.out.println("Positive : " + x);
		if (check.test(num.get())) {
			print.accept(num.get());
		} else {
			System.out.println("Not Positive");
		}

	}

}
