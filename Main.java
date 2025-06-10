import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Bridgelabz!"); //1

        System.out.print("Enter first number: ");//2
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        System.out.print("Enter temperature in Celsius: ");//3
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);

        System.out.print("Enter radius of circle: ");//4
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);

        System.out.print("Enter radius of cylinder: ");//5
        double cylRadius = scanner.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * cylRadius * cylRadius * height;
        System.out.println("Volume of Cylinder: " + volume);

        System.out.print("Enter principal amount: ");//6
        double principal = scanner.nextDouble();
        System.out.print("Enter rate of interest: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time in years: ");
        double time = scanner.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);

        System.out.print("Enter length of rectangle: ");//7
        double length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Rectangle: " + perimeter);

        System.out.print("Enter base: ");//8
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        double power = Math.pow(base, exponent);
        System.out.println("Power: " + power);

        System.out.print("Enter first number for average: ");//9
        double a = scanner.nextDouble();
        System.out.print("Enter second number for average: ");
        double b = scanner.nextDouble();
        System.out.print("Enter third number for average: ");
        double c = scanner.nextDouble();
        double average = (a + b + c) / 3;
        System.out.println("Average: " + average);

        System.out.print("Enter distance in kilometers: ");//10
        double kilometers = scanner.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Miles: " + miles);

        scanner.close();
    }
}
