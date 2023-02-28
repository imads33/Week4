public class Revers {
    public static void main(String[] args) {
        String str = "Hello, Wond3rfull world! welcome to java wonderfull";
        String words[]=str.split(" ");
        String reverse = "";

        for (int i = words.length - 1; i >= 0; i--) {
            reverse = reverse + words[i]+" ";
        }
        System.out.println("After reversing\n" + reverse);
    }
}