import java.util.Scanner;

public class Addition {
    int arr[] = { 36, 89, 56, 41, 25, 30 };

    public void checkAddition() {
        Scanner s = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Enter the number");
        int input = s.nextInt();

        System.out.println("Original Array is");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i] + arr[j];
                if (temp == input) {
                    flag = true;
                    System.out.println(
                            "Index value of numbers which can be added                         to match the given value are :\n"
                                    + i + " " + j);
                }
            }
        }

        if (flag == false) {
            System.out.println("\nelements are not found to form sum");
        }
    }

    public static void main(String[] args) {
        Addition add = new Addition();
        add.checkAddition();
    }
}