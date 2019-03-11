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
        for(int i = 2; i < value; i++) {
            if(value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
