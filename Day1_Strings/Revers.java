public class Revers {
    public static void main(String[] args) {
        String str = "Hello, Wond3rfull world! welcome to java wonderfull";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("After reversing\n" + reverse);
    }
}