// String splitting

import java.util.*;

public class tut58 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println("0");
        } else {
            String delims = "[!,?._'@\\s]+";
            String[] tokens = s.split(delims);
            System.out.println(tokens.length);
            for (String a : tokens)
                System.out.println(a);
        }
    }
}
