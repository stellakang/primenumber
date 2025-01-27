import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    private PrimeNumber primeNumber;

    @BeforeEach
    void setUp() {
        primeNumber = new PrimeNumber();
    }

    @Test
    void makePrimeNumber1() {
        List<Integer> primeNumbers1 = primeNumber.makePrimeNumber(10);
        Assertions.assertEquals(4, primeNumbers1.size());

        List<Integer> primeNumbers2 = primeNumber.makePrimeNumber(15);
        Assertions.assertEquals(6, primeNumbers2.size());
    }

    @Test
    void makePrimeNumber2() {
        List<Integer> primeNumbers = primeNumber.makePrimeNumber(10000000);
    }
}