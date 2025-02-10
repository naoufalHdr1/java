import java.util.Scanner;

public class ReverseCounting {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");        
        int n = scanner.nextInt();

        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
    }
}
