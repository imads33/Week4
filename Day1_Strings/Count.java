public class Count {
    public static void main(String[] args) {
        String str = "Hello, World3rfull world!";
        int lowerCase=0,uppperCase=0,special=0,digits=0,space=0;
        
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)>='A' && str.charAt(i)<='Z')) {
                uppperCase++;
            }else if((str.charAt(i)>='a' && str.charAt(i)<='z')){
                lowerCase++;
            }
            else if ((str.charAt(i)>='0' && str.charAt(i)<='9')) {
                digits++;
            }else if(str.charAt(i)==' '){
                space++;
            }else{
                special++;
            }
        }
        System.out.println("UpperCase letters: "+uppperCase);
        System.out.println("LoweCase letters: "+lowerCase);
        System.out.println("Special Characters: "+special);
        System.out.println("digits: "+digits);
        System.out.println("Spaces: "+space);
    }
}