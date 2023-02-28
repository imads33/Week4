public class Alphabets {
    public static void main(String[] args) {
        String str = "Hello, World3rfull world!";
        
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)>='A' && str.charAt(i)<='Z')||(str.charAt(i)>='a' &&                     str.charAt(i)<='z')) {
                System.out.println(str.charAt(i));
            }
        }
    }
}