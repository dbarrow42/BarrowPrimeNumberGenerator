import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeGeneratorTest {

    private PrimeNumberGenerator numGen;
    @BeforeEach
    private void setup() {
        this.numGen = new PrimeGenerator();
    }

    @Test
    void IsPrimeReturnsTrueForValidPrime() {
        assertTrue(this.numGen.isPrime(5));
    }

    @Test
    void IsPrimeReturnsFalseForNonPrime() {
        assertFalse(this.numGen.isPrime(4));
    }

    @Test
    void IsPrimeReturnsFalseForZero() {
        assertFalse(this.numGen.isPrime(0));
    }

    @Test
    void IsPrimeReturnsFalseForOne() {
        assertFalse(this.numGen.isPrime(1));
    }

    @Test
    void IsPrimeReturnsTrueForTwo() {
        assertTrue(this.numGen.isPrime(2));
    }

    @Test
    void GenerateReturnsListOfPrimeForValidRange() {
        List<Integer> primes = Arrays.asList(2, 3, 5);
        assertEquals(primes, this.numGen.generate(0, 5));
    }
}
