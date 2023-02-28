public class Digits {
    public static void main(String[] args) {
        String str = "Hello, World3rfull world!";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
                System.out.println(str.charAt(i));
            }
        }
    }
}