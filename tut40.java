// Encapsulation

public class tut40 {
    public static void main(String[] args) {
        student obj = new student();
        // obj.name = "Tom";
        // obj.age = 20;
        obj.setAge(12);
        System.out.println(obj.getAge());
        obj.setName("Monty");
        System.out.println(obj.getName());
    }
}
