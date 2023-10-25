import java.util.Scanner;

class Sum {   
  public static void main(String a[]) {
    int x, y, sum;
    Scanner TwoNum = new Scanner(System.in); 
    System.out.print("Type 1st number:");
    x = TwoNum.nextInt();

    System.out.print("Type 2nd number:");
    y = TwoNum.nextInt(); 

    sum = x + y;
    System.out.print("Sum is: " + sum); 
  }
} 
