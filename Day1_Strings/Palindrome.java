public class Palindrome{
    public static void main(String[] args){
        String str="malayalam";
        int i=0,j=0,count=0;

        for(i=0,j=str.length()-1;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(j)){
                j--;
                count++;
            }else{
                count=0;
                break;
            }
        }
        if(count>0){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}