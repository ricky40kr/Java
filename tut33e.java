// String Builder class

import java.lang.StringBuilder;

public class tut33e {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sun rising.");

        // Insertion
        System.out.println(sb);
        sb.insert(0, "The ");
        System.out.println(sb);

        // Deletion
        sb.delete(8, 15);
        System.out.println(sb);

        // Appending
        sb.append("Setting.");
        System.out.println(sb);

        // Reversing character
        System.out.println(sb.reverse());
    }
}
