// 2-D Array

public class tut29 {
    public static void main(String[] args) {
        // int a[row][column]=new int[5][3];
        int b[][] = { { 3, 1, 8, 9 },
                { 5, 8, 9, 4 } };

        System.out.println(b[0][3]);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
