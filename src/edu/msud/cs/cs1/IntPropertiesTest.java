package edu.msud.cs.cs1;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntPropertiesTest {
    @Test
    public void isPrime() throws Exception {
            //assertEquals(String message, long expected, long actual)
            assertEquals("error in isPrime()", false, IntProperties.isPrime(957));
            assertEquals("error in isPrime()", true, IntProperties.isPrime(104729));
            assertEquals("error in isPrime()", false, IntProperties.isPrime(9773));
            assertEquals("error in isPrime()", true, IntProperties.isPrime(2));

    }

    @Test
    public void gcd() throws Exception {
        assertEquals("error in gcd()", 1, IntProperties.gcd(12, 13));
        assertEquals("error in gcd()", 4, IntProperties.gcd(64280648,2468068));
        assertEquals("error in gcd()", 81, IntProperties.gcd(9963,574371));
        assertEquals("error in gcd()", 9, IntProperties.gcd(477, 936));
    }


    @Test
    public void lcm() throws Exception {
        assertEquals("error in lcm()", 70647633, IntProperties.lcm(574371, 9963));
        assertEquals("error in lcm()", 156, IntProperties.lcm(13, 12));
        assertEquals("error in lcm()", 49608, IntProperties.lcm(477, 936));
        assertEquals("error in lcm()", 2, IntProperties.lcm(1, 2));
    }


    @Test
    public void factors() throws Exception {
        assertEquals("error in factors()", "1 5 311 563 1555 2815 175093 875465 ", IntProperties.factors(875465));
        assertEquals("error in factors()", "1 2 4 173 346 692 31033 62066 124132 5368709 10737418 21474836 ", IntProperties.factors(21474836));
    }


    @Test
    public void relativePrimes() throws Exception {
        assertEquals("error in relativePrimes()", false, IntProperties.relativePrimes(24,48));
        assertEquals("error in relativePrimes()", true, IntProperties.relativePrimes(101, 240));
        assertEquals("error in relativePrimes()", false, IntProperties.relativePrimes(965,193));
        assertEquals("error in relativePrimes()", true, IntProperties.relativePrimes(2737, 4563));
    }

    @Test
    public void totient() throws Exception {
        assertEquals("error in totient()", 960, IntProperties.totient(2600));
        assertEquals("error in totient()", 104728, IntProperties.totient(104729));
        assertEquals("error in totient()", 43200, IntProperties.totient(88888));
        assertEquals("error in totient()", 6, IntProperties.totient(9));
    }


    @Test
    public void main() throws Exception {
    }

}