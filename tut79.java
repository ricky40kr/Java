abstract class bank {
    abstract float rateOfInterest();
}

class SBI extends bank {
    public float rateOfInterest() {
        return 9.15f;
    }
}

class PNB extends bank {
    public float rateOfInterest() {
        return 9.7f;
    }
}

public class tut79 {
    public static void main(String[] args) {
        bank b = new SBI();

        System.out.println("ROI : " + b.rateOfInterest());
    }
}
