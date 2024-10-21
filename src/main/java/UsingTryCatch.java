
import java.util.Scanner;

public class UsingTryCatch {

    public static void main(String[] args) {
       System.out.println("Please enter a value from 0 to 9: ");

       try(Scanner myscan = new Scanner(System.in)){
           int mynum = -1;
           while(mynum < 0 || mynum > 9 ){
               String input = myscan.nextLine();
               try{
                   mynum = Integer.parseInt(input);
                   if(mynum >= 0 && mynum <= 9){
                       System.out.println("The number is "+mynum);
                   }
                   else{
                       System.out.println("Invalid number. Retry entry!");
                   }
               }catch(NumberFormatException e){
                   System.out.println("Invalid number Retry!"+ e.getMessage());
               }
           }
       }
    }
}
