package Funtional_interface;

import java.util.function.BiFunction;

public class Reactangle_19 {


	public static void main(String[] args) {
		BiFunction<Double, Double, Double> area = (x, y) -> x * y;

		System.out.println("Area of rectangle : " + area.apply(12d, 12d));
	}
}

