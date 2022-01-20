// to find smallest and largest  (using Lexicographical Order) string of length 'k' in string s
// A<B<...<Y<Z<a<b<...<y<z

import java.util.*;

public class tut50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

        String smallest = s.substring(0, k);
        String largest = "";

        for (int i = 0; i < s.length() - k + 1; i++) {
            if (s.substring(i, i + k).compareTo(smallest) < 0)
                smallest = s.substring(i, i + k);
            if (s.substring(i, i + k).compareTo(largest) > 0)
                largest = s.substring(i, i + k);
        }

        System.out.println(smallest + "\n" + largest);
        sc.close();
    }
}
