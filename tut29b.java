// 3-D Array

public class tut29b {

    public static void main(String args[]) {
        int c[][][] = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
        for (

                int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int z = 0; z < 2; z++) {
                    System.out.println("arr[" + i + "][" + j + "][" + z + "] = " + c[i][j][z]);
                }
            }
        }
    }
}
