
/**
 * Write a description of class tutorial3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial3
{
    int age;//instance variable
    static int qty;//static variable
    public static void main(String[] args){
        
        int n1=10; // local variable
        //Implicit Typecasting
        
        double dt=n1;
        System.out.println(dt);
        float rt=n1;
        System.out.println(rt);
        
        
         //Explicit Typecasting
         double db=10.01;
         int itr= (int)db;
         
         System.out.println(itr);
          // Finding min, max, size and bytes
          
          System.out.println(Byte.MAX_VALUE); // returns max value
          System.out.println(Byte.MIN_VALUE); // returns min value
          System.out.println(Byte.SIZE); // returns bites
          System.out.println(Byte.BYTES); // returns bytes
          
          // Escape Sequence
          System.out.println("Hello\nWorld"); //new line
          System.out.println("Hamro\tNepal"); //tab
          System.out.println("He said \" Hi \" ");// Quotation
          
          // Unicode escape
          System.out.println("\u2764");
          
        
    }
}