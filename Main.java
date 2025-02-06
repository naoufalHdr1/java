public class Main {
    public static void main(String[] args) {
        String name = "John";
        int age = 25;
        double score = 95.67;
        char grade = 'A';

        // Printing using various format specifiers
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Score: %.2f\n", score);
        System.out.printf("Grade: %c\n", grade);

        // Multiple specifiers in a single line
        System.out.printf("Student %s, Age: %d, Score: %.2f, Grade: %c\n", name, age, score, grade);
        
        // Right-aligning output
        System.out.printf("Right aligned: |%10s|\n", name);
        System.out.printf("Right aligned: |%10d|\n", age);
        System.out.printf("Right aligned: |%10.2f|\n", score);
    }
}
