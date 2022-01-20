// Dynamic Method Dispatching

class Phone{
    public void showTime(){
        System.out.println("Time to show...");
    }

    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music...");
    }

    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class tut44 {
    public static void main(String[] args) {
        // Phone pobj = new Phone();            // Allowed
        // SmartPhone sobj = new SmartPhone();  // Allowed
        // SmartPhone ojb2 = new Phone();       // Not Allowed
        
        Phone obj = new SmartPhone();     // Dynamic Dispatching

        obj.showTime();
        obj.on();

    }
}