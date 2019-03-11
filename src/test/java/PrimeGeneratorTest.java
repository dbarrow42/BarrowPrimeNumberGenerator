import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}
