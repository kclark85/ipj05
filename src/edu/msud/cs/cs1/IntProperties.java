package edu.msud.cs.cs1;


public class IntProperties extends IntPropertiesTest {

    /*library to be used to find prime numbers, relative primes, greatest common denominator and least common factor, as well as Euler's
    * Totient Function
    *
    * API*/


    public static boolean isPrime(int n) { //find all prime numbers between 0 and n

        boolean prime = true;
        //first check if n is a multiple of 2, and get cases less than 2 out of the way
        if (n <= 2) prime = true;
        else if (n % 2 == 0) prime = false;
        //then check through all odd numbers between 3 and n to see if they are prime
        for (int i = 3; i * i <= n; i += 2)//this loop checks only to see if odd numbers have a square term in their factors
        {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
    public static boolean isPrime(long n) { //find all prime numbers between 0 and n

        boolean prime = true;
        //first check if n is a multiple of 2, and get cases less than 2 out of the way
        if (n <= 2) prime = true;
        else if (n % 2 == 0) prime = false;
        //then check through all odd numbers between 3 and n to see if they are prime
        for (int i = 3; i * i <= n; i += 2)//this loop checks only to see if odd numbers have a square term in their factors
        {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
    }

    public static int gcd(int n, int m) {
        int commonD = 0;
        int littleN = 0;
        if (m > n) littleN = n; //determines which number will be used as the basis for the loop
        else littleN = m;
        for (int i = 1; i <= littleN; i++) {
            if (m % i == 0 && n % i == 0) {
                commonD = i;
            }
        }
        return commonD;
    }
    public static long gcd(long n, long m) {
        long commonD = 0;
        long littleN = 0;
        if (m > n) littleN = n; //determines which number will be used as the basis for the loop
        else littleN = m;
        for (int i = 1; i <= littleN; i++) {
            if (m % i == 0 && n % i == 0) {
                commonD = i;
            }
        }
        return commonD;
    }

    public static long lcm(long n, long m) {
        long commonM = (n * m) / gcd(n, m);
        return commonM;

    }

    public static int lcm(int n, int m) {
        long commonM = ((long)n * (long)m)/ gcd(n, m); //m and n must be cast to long values, in case their product exceeds the bounds for int
        return (int)commonM;

    }

    public static String factors(int n) {
        String nums = new String();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) nums+= i + " ";
        }
        return nums;
    }
    public static String factors(long n) {
        String nums = new String();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) nums+= i + " ";
        }
        return nums;
    }

    public static boolean relativePrimes(int n, int m) {//determines if two numbers are relative primes
        boolean relative = false;
        if (gcd(n, m) == 1) relative = true;
        return relative;


    }
    public static boolean relativePrimes(long n, long m) {//determines if two numbers are relative primes
        boolean relative = false;
        if (gcd(n, m) == 1) relative = true;
        return relative;


    }
    public static int totient (int n)
    {
        int total = 0;
        for (int i = 0; i < n; i++)
        {
            if(relativePrimes(i,n))
            {
                total++;
            }
        }
        return total;
    }
    public static long totient (long n)
    {
        long total = 0;
        for (int i = 0; i < n; i++)
        {
            if(relativePrimes(i,n))
            {
                total++;
            }
        }
        return total;
    }


    public static void main(String[] args) {
//        System.out.println(factors(21474836));


    }
}
