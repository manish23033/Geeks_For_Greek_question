import java.util.Scanner;

class Solution {

    public static int findSum(int n) {
        if (n == 0) {
            return 0;   
        }
        return findSum(n - 1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   
        
        int result = findSum(n);
        
        System.out.println(result);
        
        sc.close();
    }
}
