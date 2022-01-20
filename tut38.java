// pass by reference (only for non primitive data type)

public class tut38 {
    public static void main(String[] args) {

        my_number object = new my_number();

        System.out.println("number = " + object.number);
        update(object);
        System.out.println("number = " + object.number);
    }

    public static void update(my_number obj) {
        obj.number++;
    }
}

class my_number {
    public int number;

    // default constructor
    public my_number() {
        number = 1;
    }
}
