package Funtional_interface;

import java.util.function.BiFunction;

public class Return_length_18 {
	public static void main(String[] args) {
		BiFunction<String, String, Integer> stringCheck = (x, y) -> (x + y).length();

		System.out.println(stringCheck.apply("Ajay", "Abhii"));
	}
}

