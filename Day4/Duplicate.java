public class Duplicate {
    public static void main(String[] args) {
        String str = "amnmnnnlkn";
        char duplicate = ' ';
        int occurance = 0, length = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (occurance < count) {
                duplicate = str.charAt(i);
                occurance = count;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == duplicate)) {
                length++;
            }
        }

        if (length == occurance) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}