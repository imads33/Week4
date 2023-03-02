import java.util.*;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        int computer, user, range, count = 1;
        System.out.println("Enter the range");
        range = s.nextInt();
        computer = random.nextInt(range);

        while (true) {
            System.out.println("Enter the number");
            user = s.nextInt();
            if (computer == user) {
                System.out.println("Congrats");
                break;
            } else if (computer > user) {
                System.out.println("Entered number is less than expected");
            } else {
                System.out.println("Entered number is grater than expected");
            }
            count++;
        }
        System.out.println("You have taken " + count + " chances");
    }
}
