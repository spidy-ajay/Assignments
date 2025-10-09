package Funtional_interface;

import java.util.function.BiConsumer;

public class IntoString_23 {

		public static void main(String[] args) {
			BiConsumer<String, Integer> check = (x, y) -> {
				System.out.print("Name: " + x + ",");
				System.out.print("Age: " + y);
			};

			check.accept("Abhii", 21);
		}
	}

