import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Start: ");
        int start = scanner.nextInt();
        System.out.print("Enter End: ");
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
            if (i == end)
                System.out.println("");
        }
    }
}
