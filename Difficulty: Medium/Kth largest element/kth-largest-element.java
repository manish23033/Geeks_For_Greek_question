class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {

          int n = arr.length ;
          
          Arrays.sort(arr);
          
          return arr[n-k];
            
    }
}