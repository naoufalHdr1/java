import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int i = 2;

        do {
           System.out.print(i + " ");
           i += 2;
        } while (i <= n);
    }
}
