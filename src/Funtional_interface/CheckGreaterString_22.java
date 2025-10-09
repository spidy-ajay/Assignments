package Funtional_interface;
import java.util.function.BiPredicate;
public class CheckGreaterString_22 {
	


		public static void main(String[] args) {
			BiPredicate<String, Integer> check = (x, y) -> x.length() >= y;
			
			System.out.println(check.test("gopal", 5));
		}
	}

