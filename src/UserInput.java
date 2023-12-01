
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        System.out.println("Take Input From User And Do Airthmetic Operations");
    Scanner userInput = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = userInput.nextInt();
        System.out.println("Enter Number 2");
        int b = userInput.nextInt();
        int sum = a + b ;
        float div = a / b ;
        int mul = a * b ;
        int subs = a - b ;
        System.out.println("Sum: " + sum + "\nMulti: " + mul + "\nDiv: "+ div + "\nSubs: "+ subs );

    }
}
