class Solution {

    public long towerOfHanoi(int n, int from, int to, int aux) {
        
        if (n == 0) {
            return 0;
        }

        return (1L << n) - 1;
    }
}