public class Factorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);  
    }

    public static void main(String[] args) {
        int num = 5;  
        long result = factorial(num);
        System.out.println("Factorial of " + num + " = " + result);
    }
}
