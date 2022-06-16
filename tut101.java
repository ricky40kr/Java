// A java program to demonstrate use
// of static keyword with Classes

import java.io.*;

public class tut101 {

    public static String str = "GeeksforGeeks";

    // Static class
    static class MyNestedClass {

        // non-static method
        public void disp() {
            System.out.println(str);
        }
    }

    public static void main(String args[]) {
        tut101.MyNestedClass obj = new tut101.MyNestedClass();
        obj.disp();
    }
}