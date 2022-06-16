interface bank {
    float rateOfInterest();

    static public void display() {
        System.out.println("Hello!");
    }

    default public void mad() {
        System.out.println("I am mad!");
    }
}

class SBI implements bank {
    public float rateOfInterest() {
        return 9.15f;
    }
}

class PNB implements bank {
    public float rateOfInterest() {
        return 9.7f;
    }
}

public class tut78 {
    public static void main(String[] args) {
        bank b = new SBI();

        System.out.println("ROI : " + b.rateOfInterest());
        bank.display();
    }
}
