
import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
    
    public static void main(final String[] args) {

        try (Scanner SR = new Scanner(System.in)) {
            System.out.println("Enter a number");
            final BigDecimal b = SR.nextBigDecimal();

            System.out.println("Your number is " + b.toEngineeringString());
        }
    }
}