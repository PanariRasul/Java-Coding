import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        // Ask user name and return greeting text to user


        Scanner sc = new Scanner(System.in);
        System.out.println("What is Your Name?");
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", Have a Good Day!");
    }

}
