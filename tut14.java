// Ternary opertor for else if ladder

public class tut14 {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        int c = 66;
        int result = 0;
        result = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println("Largest number of three number is " + result);
    }
}
