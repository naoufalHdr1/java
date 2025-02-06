public class CircleCalculator {
    public static void main(String[] args) {
    	double radius = 7.0;
        double pi = Math.PI;

        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("circumference of the circle: %.2f\n", circumference);
    }
}
