import java.util.Scanner;

class HelloApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;
        System.out.println("The result of the sum is " + number1 + " + " + number2 + " = " + sum);

        double division = (double) number1 / number2;
        System.out.println("the division of " + number1 + "/" + number2 + " = " + division);

        scanner.close();
    }

}