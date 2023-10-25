import java.util.Scanner;

public class PEMDAS {
   public static void main(String[] args) {
   int   FirstDigit;
   int   SecondDigit;
   int   ThirdDigit;
   int   FourthDigit;
   int   FifthDigit;
   int   SixthDigit;
   int   Result;
   
   Scanner in = new Scanner(System.in);
   
   System.out.print("Input the First Digit: ");
   FirstDigit = in.nextInt();
   
   System.out.print("Input the Second Digit: ");
   SecondDigit = in.nextInt();
   
   System.out.print("Input the Third Digit: ");
   ThirdDigit = in.nextInt();
   
   System.out.print("Input the Fourth Digit: ");
   FourthDigit = in.nextInt();
   
   System.out.print("Input the Fifth Digit: ");
   FifthDigit = in.nextInt();
   
   System.out.print("Input the Sixth Digit: ");
   SixthDigit = in.nextInt();
   
   in.close();
   
   
   Result = FirstDigit / (SecondDigit+ThirdDigit)*FourthDigit + FifthDigit * FifthDigit + SixthDigit;
   
   
   
   System.out.println("The RESULT is: " +Result);
   
   
 }
}