import java.util.Scanner;

class calculator {
    double num1, num2;

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double diff(double num1, double num2) {
        return num1 - num2;
    }
}

class calculation extends calculator {
    public double prod(double num1, double num2) {
        return num1 * num2;
    }

    public double quot(double num1, double num2) {
        return num1 / num2;
    }
}

public class tut77 {
    public static void main(String[] args) {
        int choice;

        Scanner sc = new Scanner(System.in);

        calculation cal = new calculation();
        System.out.println("\t\t\t*** CALCULATOR***\n\n");

        System.out.print("Enter first number : ");
        cal.num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        cal.num2 = sc.nextDouble();
        System.out.println();
        System.out.println("\t\t***Menu***");
        System.out.println("\t 1. Add");
        System.out.println("\t 2. Subtract");
        System.out.println("\t 3. Multiply");
        System.out.println("\t 4. Divide");
        System.out.print("Enter your choice : ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println(
                        "The addition of " + cal.num1 + " and " + cal.num2 + " is " + cal.add(cal.num1, cal.num2));
                break;

            case 2:
                System.out.println(
                        "The subtraction of " + cal.num1 + " and " + cal.num2 + " is " + cal.diff(cal.num1, cal.num2));
                break;

            case 3:
                System.out.println(
                        "The product of " + cal.num1 + " and " + cal.num2 + " is " + cal.prod(cal.num1, cal.num2));
                break;

            case 4:
                System.out.println(
                        "The division of " + cal.num1 + " and " + cal.num2 + " is " + cal.quot(cal.num1, cal.num2));
                break;

            default:
                System.out.println("\t\tWrong choice !");
                break;
        }
        sc.close();
    }

}
