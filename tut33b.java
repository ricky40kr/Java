// String (immutable)

public class tut33b {
    public static void main(String[] args) {
        // Spliting the string after a particular given cahracter
        String car = "Hyundai,Mercedes,Lamborgini,Land Rover,Range Rover";
        String allCars[] = car.split(",");

        for (String e : allCars) {
            System.out.println(e);
        }

        System.out.println(car.indexOf('a')); // positon of given character (only the first one)
        System.out.println(car.indexOf('z')); // Return -1 for absence of character
        System.out.println(car.indexOf("Mer"));
        System.out.println(car.toLowerCase());
        System.out.println(car.toUpperCase());

        String rap = "           ram is   a  goodboy           ";
        System.out.println(rap);
        System.out.println(rap.trim()); // Trims the Spaces before and after a String

        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Rhitik");
        System.out.println(letter);
    }
}
