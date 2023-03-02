import java.util.Scanner;

public class StudentDetails {

    Scanner s = new Scanner(System.in);
    Object students[] = new Object[2];

    public void setStudentDetails() {
        for (int i = 0; i < students.length; i++) {
            Student  student= new Student();
            
            System.out.println("Enter student id");
            student.setStudent_id(s.nextInt());

            System.out.println("Enter Student name");
            student.setSname(s.next());

            System.out.println("Enter email id");
            student.setEmail(s.next());

            System.out.println("Enter city");
            student.setCity(s.next());

            System.out.println("Enter mobile");
            student.setMobile(s.nextLong());

            students[i]=student;
        }
    }

    public void getStudentDetails() {
        for(int i=0;i<students.length;i++) {
            Student student=(Student)students[i];
            
            System.out.println("Student id: " + student.getStudent_id());
            System.out.println("Student name: " + student.getSname());
            System.out.println("Student email: " + student.getEmail());
            System.out.println("Student city: " + student.getCity());
            System.out.println("Student mobile: " + student.getMobile());
        }
    }

    public static void main(String args[]) {
        StudentDetails obj = new StudentDetails();
        obj.setStudentDetails();
        obj.getStudentDetails();
    }

}