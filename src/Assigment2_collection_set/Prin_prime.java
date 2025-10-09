package Assigment2_collection_set;

import java.util.HashSet;
import java.util.Set;

public class Prin_prime {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Set.of(2, 3, 4, 5, 10, 11, 15, 17, 18, 19, 20));

        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

   
    static boolean isPrime(int n) {
        if (n <= 1) return false;
		for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
