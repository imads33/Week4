public class Encryption {
    String data = "Hello, Wond3rfull world! WeLcoMe to JAVA";
    String enData = "", deData = "";
    String evenIn = "", oddIn = "";

    public void encryptData() {
        for (int i = 0; i < data.length(); i++) {
            if (i % 2 == 0) {
                if (data.charAt(i) == ' ') {
                    evenIn = evenIn + '%';
                } else {
                    evenIn = evenIn + data.charAt(i);
                }
            } else {
                if (data.charAt(i) == ' ') {
                    oddIn = oddIn + '%';
                } else {
                    oddIn = oddIn + data.charAt(i);
                }
            }
        }
        enData = evenIn + oddIn;
        System.out.println("\nEncrypted message is :\n" + enData);
    }

    public void decryptData() {
        int j = 0, k = 0;
        System.out.println("\nEncrypted message evenIn :\n" + evenIn);
        System.out.println("\nEncrypted message oddIn :\n" + oddIn);

        for (int i = 0; i < data.length(); i++) {
            if (i % 2 == 0) {
                if (j < evenIn.length()) {
                    if (evenIn.charAt(j) == '%') {
                        deData = deData + ' ';
                        j++;
                    } else {
                        deData = deData + evenIn.charAt(j);
                        j++;
                    }
                }
            } else {
                if (k < oddIn.length()) {
                    if (oddIn.charAt(k) == '%') {
                        deData = deData + ' ';
                        k++;
                    } else {
                        deData = deData + oddIn.charAt(k);
                        k++;
                    }
                }
            }
        }
        System.out.println("\nDecrypted message is :\n" + deData);
    }

    public static void main(String[] args) {
        Encryption e = new Encryption();
        System.out.println("\nOriginal data is :\n" + e.data);
        e.encryptData();
        e.decryptData();
    }
}