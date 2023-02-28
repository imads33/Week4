public class Length {
    public static void main(String[] args) {
        String str = "hi hello123 how why !@#$ are you 12344";
        String words[] = str.split(" ");
        int i = words.length - 1;

        System.out.println("Length of first word " + words[0] + " is " + words[0].length());
        System.out.println("Length of last word " + words[i] + " is " + words[i].length());

    }
}