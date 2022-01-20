// Inheritance

public class tut42 {

    public static void main(String[] args) {

        teacher t = new teacher();
        // Method Overriding
        t.name = "Mr. Harry";
        t.eat();
        t.walk();
        t.teach();
        // t.sing(); // can't access it as it not in parent class or child class

        singer s = new singer();
        s.name = "Mr. Justin";
        s.eat();
        s.sing();
        // s.teach(); // can't access it as it not in parent class or child class

        person p = new person();
        p.name = "Mr. Jetha lal";
        p.eat();
        // p.teach();
        // p.sing();
        // can't access it as it don't exists in person class or its parent class
        // they are in children class

        // upcasting
        person p2 = t;
        p2.name = "Mr. Sam";
        p2.eat();
        p2.walk();
        // p2.teach();
        // p2.sing();

        // Down Casting
        teacher t1 = new teacher();
        singer s1 = new singer();
        person p3 = t1;
        teacher t2 = (teacher) p3;
        
        System.out.println(t1 instanceof teacher);
        System.out.println(s1 instanceof singer);
        System.out.println(t1 instanceof person);
        System.out.println(p3 instanceof singer);
        
        t1.name = "Mr. Rock";
        t1.teach();
        t1.walk();
        t1.eat();

        t2.name = "Mr. Tom";
        t2.teach();
        t2.walk();
        t2.eat();
        // p3.teach();
        // p3.eat();

        // Super keyword - To access the parent class by the child class
        teacher t3 = new teacher();
        t3.name = "Mr. Jackson";
        t3.dance();
    }
}
