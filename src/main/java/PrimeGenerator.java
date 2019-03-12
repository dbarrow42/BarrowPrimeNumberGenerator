import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator implements PrimeNumberGenerator {

    public List<Integer> generate(int startingValue, int endingValue) {
        if(startingValue > endingValue) {
            int temp = endingValue;
            endingValue = startingValue;
            startingValue = temp;
        }
        List<Integer> primes = new ArrayList<Integer>();
        while(startingValue <= endingValue) {
            if(isPrime(startingValue)) {
                primes.add(startingValue);
            }
            startingValue++;
        }
        return primes;
    }

    public boolean isPrime(int value) {
        // By mathematical definition, all values in the range (- infinity, 1] are non prime, as well as all even numbers greater than 2
        if(value < 2 || (value > 2 && value % 2 == 0)) return false;
        /*
         Only need to check up to the square root of value because value must be equal to factors x * y in order to be prime. Both x and y must be less than or equal to
         the square root or their product would be larger than value. You only need to check the larger potential factor as previous iterations have checked the
         integers smaller than it.
        */
        for(int i = 3; i <= Math.sqrt(value); i += 2) { // Only need to check integers less than the square root of value, as a non prime number value
            if(value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
