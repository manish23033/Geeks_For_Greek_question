class Solution {
    int missingNum(int arr[]) {
        int n = arr.length;

        long res = 0;          // ✅ changed to long
        int N = n + 1;

        for(int i = 0; i < n; i++){
            res += arr[i];    // safe accumulation
        }

        long actualSum = (long) N * (N + 1) / 2;  // ✅ casting to long

        long sumDiff = actualSum - res;

        return (int) sumDiff;  // final result fits in int
    }
}