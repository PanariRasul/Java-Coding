import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {
    // Compair User input is grater than your number or not

        Scanner sc = new Scanner(System.in);

        int myNumber = 25;
        System.out.println("Enter Your Number: ");
        int userNumber = sc.nextInt();
        System.out.println(myNumber < userNumber);

        if ((myNumber < userNumber) == true) {
            System.out.println("You Choice Number Greater than Computer!");
        } else if (myNumber == userNumber) {
            System.out.println("Your Number And Computer Is Same");

        }else {
            System.out.println("Your Number Is Lesser Than Computer");
        }
    }
}
