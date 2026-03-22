class Solution {
    int maxSubarraySum(int[] arr) {
         int n = arr.length ;
         
          int arrMax =arr[0 ];
          int currSum = arr[0];
          
          for(int i = 1 ; i<n ; i++ ){
              currSum = Math.max(arr[i] , currSum+arr[i]);
              
              
              arrMax = Math.max(arrMax  , currSum );
          }
          return arrMax ;
    }
}
