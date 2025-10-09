package Funtional_interface;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class Startwith_5 {



		public static void main(String[] args) {
			Supplier<String> name = () -> {
				return "Abhishek";
			};
			
			
			Predicate<String> check = x -> x.startsWith("A");
			
			if (check.test(name.get())) {
				System.out.println("Name Accepted");
			}else {
				System.out.println("Denied");
			}
		
		}
	}


