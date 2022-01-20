// Array

public class tut27 {
    public static void main(String[] args) {
        // int[] marks;
        // marks = new int[10];

        // int[] marks= new int[5];
        int marks[] = new int[5]; // By default every position have 0 value of an array
        // int[] rollNo[], classes;
        // int rollNo[], classes[];

        System.out.println(marks[1]);

        int ramSlot[] = { 1, 2, 85, 400, 65 };
        ramSlot[3] = 50;
        for (int i = 0; i < ramSlot.length; i++) {
            System.out.println(ramSlot[i]);
        }

    }
}
