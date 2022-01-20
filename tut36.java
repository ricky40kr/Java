// Methods
// Method Overloading - When two or more methods have the same name but different parameters

public class tut36 {
    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 67;
        float num3 = 56.48f;

        sayHi();
        int result = maxOf(num1, num2);
        System.out.println(result);

        float result2 = maxOf(num1, num3);
        System.out.println(result2);
    }

    static int maxOf(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int maxOf(int a, float b) {
        if (a > b) {
            return a;
        } else {
            return (int) b;
        }
    }

    static void sayHi() {
        System.out.println("Hi...");
        System.out.println("Good Morning");
    }
}
