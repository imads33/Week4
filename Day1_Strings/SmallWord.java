public class SmallWord {
    public static void main(String[] args) {
        String str = "Hello, Wond3rfull world! welcome to java wonderfull";
        String words[] = str.split(" ");
        String small = words[0];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() < small.length()) {
                small = word;
            }
        }
        System.out.println("Longest word in string is " + small);
    }
}