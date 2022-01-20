// Series
// 1 + 1/2 + 1/3 + 1/4....

import java.util.Scanner;

public class tut18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n term of series : ");
        int n = sc.nextInt();

        float result = 0;

        for (float i = 1; i <= n; i++) {
            result += 1 / i;
        }
        System.out.println("The sum of the series is : " + result);
        sc.close();
    }
}
