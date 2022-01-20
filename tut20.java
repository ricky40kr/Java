// Break and Continue

public class tut20 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                continue;
            }
            if (i == 20) {
                break;
            }
            System.out.println(i);
        }
    }
}
