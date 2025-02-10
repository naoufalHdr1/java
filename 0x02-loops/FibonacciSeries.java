import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int a = 0, b = 1, next;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");            
            next = a + b;
            a = b;
            b = next;
        }
    }
}
