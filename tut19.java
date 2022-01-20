// Series
// 1 - 1/2 + 1/3 - 1/4 + 1/5 ... 1/n
// nested for loop with if-else

import java.util.Scanner;

public class tut19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n term of series : ");
        int n = sc.nextInt();

        float result = 0;

        for (float i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                result -= (1 / i);
            } else {
                result += (1 / i);
            }

        }
        System.out.println("The sum if the series is : " + result);
        sc.close();
    }
}
