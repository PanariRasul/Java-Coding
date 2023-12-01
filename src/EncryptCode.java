import java.util.Scanner;

public class EncryptCode {

    public static void main(String[] args) {

        //Encrypt the grade by 8 and also return original grade and ask grade to user


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Grade");
        char grade = sc.next().charAt(0);

        System.out.println("How many grade we encrypt?");
        int Encrypt = sc.nextInt();


        char EncryptGrade = (char)(grade + Encrypt);
        System.out.println("Encrypted Grade is: " + EncryptGrade);

        System.out.println("Your Original Grade Is: " + grade );
    }
}
