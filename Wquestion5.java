import java.util.Scanner;

/**
 * Write a description of class Wquestion5 here.
 *
 * @author Kristin
 * @version v2.1
 */
public class Wquestion5
{
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first Number");
      int firstNum=scan.nextInt();//for whole numbers
      System.out.println("Enter Second Number");
      int secondNum=scan.nextInt();
    
      int sum = firstNum +secondNum;
      System.out.println("The sum is: "+firstNum+ secondNum);
      
        
    }
}