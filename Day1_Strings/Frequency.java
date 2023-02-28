public class Frequency {
    public static void main(String[] args) {
        String str = "Hello, Wond3rfull world!";
        int max = 5, min = 1;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
            if (count < min) {
                min = count;
            }
            System.out.println("Frequency of Alphabet " + str.charAt(i) + " is in string " + count);
        }

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == min) {
                System.out.println("low Frequency Alphabet in string is " + str.charAt(i));
            }
            if (count == max) {
                System.out.println("high Frequency Alphabet in string is " + str.charAt(i));
            }
        }

    }
}