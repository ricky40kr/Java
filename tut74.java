import java.util.*;

public class tut74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            L.add(sc.nextInt());
        }
        int Q = sc.nextInt();

        while (Q-- > 0) {
            String random = sc.next();
            if (random.equals("Insert")) {
                int pos = sc.nextInt();
                int num = sc.nextInt();
                L.add(pos, num);
            } else {
                int pos = sc.nextInt();
                L.remove(pos);
            }
        }

        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i) + " ");
        }
        sc.close();
    }
}