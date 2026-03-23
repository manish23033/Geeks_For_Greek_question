class Solution {
    public int reverseExponentiation(int n) {

        int original = n;   // store base

        // Step 1: reverse n
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        // Step 2: fast exponentiation
        int res = 1;
        int base = original;
        int exp = reversed;

        while (exp > 0) {

            // if odd
            if (exp % 2 == 1) {
                res = res * base;
            }

            // square base
            base = base * base;

            // reduce exponent
            exp = exp / 2;
        }

        return res;
    }
}