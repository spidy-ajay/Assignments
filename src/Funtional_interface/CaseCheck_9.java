package Funtional_interface;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
public class CaseCheck_9 {
	


		public static void main(String[] args) {
			Function<String, String> convert = x -> {
				return x.toUpperCase();
			};

			Supplier<String> name = () -> "ajay";

			Consumer<String> print = x -> System.out.println(x);

			print.accept(convert.apply(name.get()));

		}
	}


