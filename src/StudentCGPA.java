public class StudentCGPA {

    public static void main(String[] args) {
        //Calculate Student Marks CGPA

        float sub1 = 85;
        float sub2 = 68;
        float sub3 = 91;
        float sub4 = 55;
        float sub5 = 75;

        float CGPA = (((sub1 + sub2 + sub3 + sub4 + sub5)/5)/10);

        System.out.println("Your CGPA is: " + CGPA);
    }
}
