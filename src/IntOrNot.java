import java.sql.SQLOutput;
import java.util.Scanner;

public class IntOrNot {

    public static void main(String[] args) {
        //Check Enter Number Is Integer Is Or Not

        System.out.println("Enter your Number");
        Scanner sc = new Scanner(System.in);
        System.out.println( sc.hasNextInt());

        if (sc.hasNextInt()==true) {
            System.out.println("You Entered NUmber Is Integer");
        }
        else {
            System.out.println("You not Enter Integer!");
            System.out.println("Please conform your number");
        }

    }

}
