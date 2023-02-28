import java.util.Scanner;

public class StudentDetails {
    Scanner s = new Scanner(System.in);
    String temp;
    String studentName, studentEmail, studentPass, studentPhone;

    public void readName() {
        System.out.println("Enter your name : ");
        temp = s.nextLine();
        temp = temp.trim();
        if (temp.charAt(0) >= 'A' && temp.charAt(0) <= 'Z') {
            if (temp.length() >= 5 && temp.length() <= 15) {
                studentName = temp;
                readPhone();
            } else {
                System.out.println("Name should contain 5-15 characrters");
            }
        } else {
            System.out.println("Name should start with uppercase letter");
        }
    }

    public void readPhone() {
        boolean onlyDigits = false;
        System.out.println("Enter your Phone : ");
        temp = s.next();
        temp = temp.trim();
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) >= '0' && temp.charAt(i) <= '9') {
                onlyDigits = true;
            } else {
                onlyDigits = false;
                break;
            }
        }
        if (onlyDigits == true) {
            if (temp.length() == 10) {
                if (temp.charAt(0) >= '6') {
                    studentPhone = temp;
                    readEmail();
                } else {
                    System.out.println("Phone should starts with 9/7/8/6");
                }
            } else {
                System.out.println("invalid phone number\nEnter 10 digits phone number only");
            }
        } else {
            System.out.println("Phone should only contain digits");
        }
    }

    public void readEmail() {
        System.out.println("Enter your Email : ");
        temp = s.next();
        temp = temp.trim();

        if (temp.charAt(0) == ' ' || !((temp.charAt(0) >= 'A' && temp.charAt(0) <= 'Z')
                || (temp.charAt(0) >= 'a' && temp.charAt(0) <= 'z')
                || (temp.charAt(0) >= '0' && temp.charAt(0) <= '9'))) {
            System.out.println("Email shoul not start with special characters");
        } else {
            for (int i = 0; i < temp.length(); i++) {
                if (temp.charAt(i) == ' ' || !((temp.charAt(i) >= 'A' && temp.charAt(i) <= 'Z')
                        || (temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z')
                                && (temp.charAt(i) >= '@' || temp.charAt(i) == '.')
                        || temp.charAt(i) >= '0' && temp.charAt(i) <= '9')) {
                    System.out.println("Email shoul not contain special characters except @ and .");
                } else {
                    if (temp.endsWith(".com") || temp.endsWith(".in")) {
                        if (temp.length() >= 5 && temp.length() <= 20) {
                            studentEmail = temp;
                            readPassword();
                            break;
                        } else {
                            System.out.println("Email length should be between 5-20 character");
                            break;
                        }
                    } else {
                        System.out.println("Email should ends with .in or .com");
                    }
                }
            }
        }
    }

    public void readPassword() {
        int spcl = 0, upper = 0, lower = 0, digit = 0;
        System.out.println("Enter your Password : ");
        temp = s.next();

        if (!temp.contains(" ")) {
            if (temp.length() >= 5 && temp.length() <= 15) {
                for (int i = 0; i < temp.length(); i++) {
                    if (temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z') {
                        lower++;
                    } else if (temp.charAt(i) >= 'A' && temp.charAt(i) <= 'Z') {
                        upper++;
                    } else if (!((temp.charAt(i) >= 'a' && temp.charAt(i) <= 'z')
                            || (temp.charAt(i) >= 'A' && temp.charAt(i) <= 'Z')
                            || (temp.charAt(i) >= '0' && temp.charAt(i) <= '9'))) {

                        spcl++;
                    } else if (temp.charAt(i) >= '0' && temp.charAt(i) <= '9') {
                        digit++;
                    }
                }
                if (lower > 0 && upper > 0 && spcl > 0 && digit > 0) {
                    studentPass = temp;
                    Display();
                } else {
                    System.out.println(
                            "Password should contains atleast \n1 uppercase, 1 lowercase, 1 digit and 1 special character.");
                }
            } else {
                System.out.println("Password length should be between 5-15 characters");
            }
        } else {
            System.out.println("Password should not contain empty spaces");
        }
    }

    public void Display() {
        System.out.println("student name is : " + studentName);
        System.out.println("student Phone is : " + studentPhone);
        System.out.println("student Email is : " + studentEmail);
        System.out.println("student Password is : " + studentPass);
    }

    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails();
        sd.readName();
    }
}