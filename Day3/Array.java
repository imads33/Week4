import java.util.Scanner;
public class Array{
    int arr[]={36,89,56,41,25,30};
    int noOfElements=arr.length-1;

    public void userInput(){
        Scanner s=new Scanner(System.in);
        int temp,i=0;
        System.out.println("Enter the number of iterations");
        int input=s.nextInt();
        
        System.out.println("Original Array is");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        
        for(i=0;i<input;i++){
            temp=arr[0];
            for (int j = 0; j < noOfElements; j++) {
                arr[j] = arr[j + 1];
            }
            arr[noOfElements] = temp;
        }
        
        System.out.println("Array is");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    
    public static void main(String[] args){
        Array array=new Array();
        array.userInput();
    }
}