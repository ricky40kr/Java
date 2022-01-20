// String (immutable)

public class tut33 {
    public static void main(String[] args) {
        String name = "Rhitik"; // initialization by string literal
        String name2 = "Kumar";
        String name3 = "Rhitik";
        // If there already exists a string value "Rhitik"/"Kumar" in the reference
        // pool, then
        // string will reference of that string and no new String object will be
        // created.

        String anotherName = new String("Rhitik"); // initialization by new object
        // JVM is forced to create a new string reference, even if "Rhitik" is in
        // the reference pool.
        String anotherName2 = new String("Thakur");

        System.out.println(name);
        System.out.println(anotherName);

        // these will return true is the String are equal and there references are same
        // at the same time
        System.out.println(name == anotherName);
        System.out.println(name == name2);
        System.out.println(name == anotherName2);
        System.out.println(name == name3);

        System.out.println("*************");
        System.out.println(name.charAt(0)); // print the char at the given index
        System.out.println(name.length());
        System.out.println(name.substring(2)); // Beigning Index
        System.out.println(name.substring(1, 5)); // Beigning Index and ending index
        System.out.println(name.contains("hi")); // checks the alphabet or word is present in the string or not
        System.out.println(name.equals(name2)); // check the values not the object reference
        System.out.println(name.equals(name3));
        System.out.println(name.equals(anotherName));
        System.out.println(name.isEmpty()); // check whether the string is empty or not

        System.out.println("*************");
        System.out.println(anotherName);
        anotherName = anotherName + " Kumar"; // this appending method is more time and memory consuming due to which we
        // uses string builder class
        System.out.println(anotherName); // make changes in the original string

        System.out.println(name.concat(" Rajput")); // Don't change the original string
        System.out.println(name);
        System.out.println(name.replace('R', 'Z')); // It is case sensitive

        // Comparition
        System.out.println("************");
        String n1 = "Ram Gopal";
        String n2 = "Ram Gopal";
        String n3 = new String("Sam Bhardwaj");
        String n4 = new String("Sam Gopal");

        // n1=n2 : 0 value
        System.out.println("For n1 and n2 coparision : ");
        if (n1.compareTo(n2) == 0) {
            System.out.println("The strings are Equal!");
        } else {
            System.out.println("The Strings are not Equal!");
        }
        System.out.println();

        // for +ve and -ve values first the lenght is compared then the first different
        // charater(which comes first in alphabet is longest string)

        // n1>n2 : +ve value
        System.out.println("For n1 and n2 coparision : ");
        if (n1.compareTo(n3) > 0) {
            System.out.println("The String n1 is greater than n3!");
        } else {
            System.out.println("The Strings n3 is greater than n1!");
        }
        System.out.println();

        // n1<n2 : -ve value
        System.out.println("For n1 and n2 coparision : ");
        if (n1.compareTo(n4) < 0) {
            System.out.println("The String n1 is Smaller than n4!");
        } else {
            System.out.println("The Strings n4 is Smaller than n1!");
        }
    }
}
