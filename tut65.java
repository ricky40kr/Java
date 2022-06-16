import java.io.*;
import java.math.*;

public class tut65 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = new String();
        s = bufferedReader.readLine();
        BigInteger bigInt = new BigInteger(s);
        boolean result = bigInt.isProbablePrime(100);
        if (result) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
