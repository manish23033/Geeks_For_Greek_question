// User function Template for Java
import java.util.*;
class Solution {
    static int orGate(int arr[], int n) {
        // code here
        int result =0;
        for(int i =0 ; i<arr.length ; i++){
             result = result | arr[i];
        }
        return result ;
    }
    
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        int[] arr = new int[n] ;
        
        for(int i = 0 ; i< n ; i++){
            arr[i]=sc.nextInt();
            
            int res = orGate(arr ,n);
            
            System.out.println(res);
        }
        
    }
}