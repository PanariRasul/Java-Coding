import java.util.Scanner;

public class KmtoM {

    public static void main(String[] args) {

        //convert kilometer to miles and meters

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Distance in Kilometers (KM)");
        double distance = sc.nextDouble();
        double miles = (distance / 1.609339);
        double meters = (distance * 1000);

        System.out.println("Distance In Miles: " + miles);
        System.out.println("Distance In Meters: " + meters);

    }
}
