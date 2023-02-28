public class Words{
    public static void main(String[] args){
        String str="hi hello how why !@#$ are you 12344";
        String words[]=str.split(" ");

        System.out.println("Number of words in given string "+ words.length);
    }
}