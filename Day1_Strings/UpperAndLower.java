public class UpperAndLower {
    public static void main(String[] args) {
        String str = "Hello, World3rfull world!";
        int upperCount=0,loweCount=0;
        System.out.println("UpperCase Letters Are :");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='A' && str.charAt(i)<='Z') {
                System.out.print(str.charAt(i)+" ");
                upperCount++;
            }
        }
        System.out.println("LowerCase Letters Are :");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a' && str.charAt(i)<='z') {
                System.out.print(str.charAt(i)+" ");
                loweCount++;
            }
        }

        System.out.println("UpperCase Letters count: "+upperCount);
        System.out.println("LowerCase Letters count: "+loweCount);
    }
}