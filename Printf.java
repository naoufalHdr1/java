public class Printf {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        System.out.println("| Name  | Age | Score |");
        System.out.println("-----------------------");

        System.out.printf("| %-5s | %3d | %5d |\n", "Alice", 23, 95);
        System.out.printf("| %-5s | %3d | %5d |\n", "Bob", 27, 88);
        System.out.printf("| %-5s | %3d | %5d |\n", "Eva", 21, 91);

        System.out.println("-----------------------");
    }
}

