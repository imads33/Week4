public class PalindromeWords {
    String str = "malayalam madam teaches dad to dance jalayalaj balayalab";
    String words[] = str.split(" ");
    String palindromes[] = new String[words.length];
    String sameLength[] = new String[words.length];
    int index = 0;

    public void checkPelindrome(String word) {
        int i = 0, j = 0, count = 0;
        for (i = 0, j = word.length() - 1; i < word.length() / 2; i++) {
            if (word.charAt(i) == word.charAt(j)) {
                j--;
                count++;
            } else {
                count = 0;
                break;
            }
        }
        if (count > 0) {
            palindromes[index] = word;
            index++;
        }
    }

    public void words() {
        for (int i = 0; i < words.length; i++) {
            checkPelindrome(words[i]);
        }

        System.out.println("\nPalindrome words in given String are : ");
        for (int i = 0; i < index; i++) {
            System.out.println(palindromes[i]);
        }

        String longest = palindromes[0];
        for (int i = 0; i < index; i++) {
            if (palindromes[i].length() > longest.length()) {
                longest = palindromes[i];
            }
        }

        longestPalindromes(longest);
    }

    public void longestPalindromes(String longest) {
        int ind = 0;
        for (int i = 0; i < index; i++) {
            String word = palindromes[i];
            if (word.length() == longest.length()) {
                sameLength[ind] = word;
                ind++;
            }
        }
        for (int i = 0; i < ind; i++) {
            for (int j = 0; j < ind; j++) {
                String word1 = sameLength[i];
                String word2 = sameLength[j];
                for (int k = 0; k < word1.length(); k++) {
                    if (word1.charAt(k) < word2.charAt(k)) {
                        String temp = word1;
                        sameLength[i] = word2;
                        sameLength[j] = temp;
                    }
                }
            }
        }

        System.out.println("Longest Palindrome words are ");
        for (int i = 0; i < ind; i++) {
            System.out.println(sameLength[i]);
        }
    }

    public static void main(String[] args) {
        PalindromeWords pw = new PalindromeWords();
        System.out.println("Given String is :\n" + pw.str);
        pw.words();
    }
}