public class teacher extends person {

    public void teach() {
        System.out.println(name + " is teaching");
    }

    // Method Overriding
    public void eat() {
        System.out.println("Teacher " + name + " is eating");
    }

    // Super Keyword
    public void dance() {
        super.dance();
        System.out.println("Teacher " + name + " is dancing");
    }
}
