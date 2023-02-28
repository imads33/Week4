public class SwapCase {
    public static void main(String[] args) {
        String str = "Hello, Wond3rfull world! WeLcoMe to JAVA";
        System.out.println("Original string is ");
        System.out.println(str);
        String updated="";

        for (int i = 0; i < str.length(); i++) {
            String c="";
            if (str.charAt(i)>='a' && str.charAt(i)<='z') {
                c=c+str.charAt(i);
                updated=updated+c.toUpperCase();
            }else if (str.charAt(i)>='A' && str.charAt(i)<='Z'){
                c=c+str.charAt(i);
                updated=updated+c.toLowerCase();
            }else{
                c=c+str.charAt(i);
                updated=updated+c;
            }
        }
        System.out.println("updated string is ");
        System.out.println(updated);
    }
}