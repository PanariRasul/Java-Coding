import java.util.Scanner;


public class MarksPercentage {
    public static void main(String[] args) {

        // Take student Marks from users
        System.out.println("Calculate Student Marks Percentage Here");
        Scanner studentMarks = new Scanner(System.in);
        System.out.println("Enter The First subject marks");
        int sub1 = studentMarks.nextInt();
        System.out.println("Enter The second subject marks");
        int sub2 = studentMarks.nextInt();
        System.out.println("Enter The third subject marks");
        int sub3 = studentMarks.nextInt();
        System.out.println("Enter The fourth subject marks");
        int sub4 = studentMarks.nextInt();
        System.out.println("Enter The fifth subject marks");
        int sub5 = studentMarks.nextInt();
        System.out.println("Enter Maximum Marks");
        float maxMarks = studentMarks.nextFloat();



        // Add All Subject marks

       int sum = sub1+sub2+sub3+sub4+sub5;

        System.out.println("Total marks student Obtain: "+ sum);

        //calculate Total marks percentage

        float perctage = (float)((sum/maxMarks)*100);

        System.out.println("Student Score: " +perctage+"% in there result");





    }
}
