// User function Template for Java
class Solution {
    String sort(String s) {
        // code here
        char[] t = s.toCharArray();
        Arrays.sort(t);
        return new String(t);
    }
}