public class LengthyWord {
    public static void main(String[] args) {
        String str = "Hello, Wond3rfull world! welcome to java";
        String words[] = str.split(" ");
        String lengthy = words[0];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() > lengthy.length()) {
                lengthy = word;
            }
        }
        System.out.println("Longest word in string is " + lengthy);
    }
}