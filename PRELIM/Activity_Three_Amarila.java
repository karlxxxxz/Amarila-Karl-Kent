import java.util.Scanner;

public class Activity_Three_Amarila {

  final static double c1Price = 109.00;
  final static double c2Price = 153.00;
  final static double c3Price = 250.00;
  final static double c4Price = 499.00;
  final static double c5Price = 699.00;
  final static double r1Price = 35.00;
  final static double r2Price = 50.00;
  final static double pesoToDollar = 56.00;
  
  public static void main(String[] args) {
  System.out.println("Menu Selection");
   Scanner sc = new Scanner(System.in);
   
    System.out.println("Amount of C1 Meal: ");
    int numberOfC1 = sc.nextInt();
    
    System.out.println("Amount of C2 Meal: ");
    int numberOfC2 = sc.nextInt();
    
    System.out.println("Amount of C3 Meal: ");
    int numberOfC3 = sc.nextInt();
    
    System.out.println("Amount of C4 Meal: ");
    int numberOfC4 = sc.nextInt();
    
    System.out.println("Amount of C5 Meal: ");
    int numberOfC5 = sc.nextInt();
    System.out.print("\n");
    
    System.out.println("Menu Selection     Add ons");
    System.out.println("C1 = P109.00       R1 = P35.00");
    System.out.println("C2 = P153.00       R2 = P50.00");
    System.out.println("C3 = P250.00                  ");
    System.out.println("C4 = P499.00                  ");
    System.out.println("C5 = P699.00             "+"\n");
    
    System.out.println("Number of C1: "+numberOfC1);
    System.out.println("Number of C2: "+numberOfC2);
    System.out.println("Number of C3: "+numberOfC3);
    System.out.println("Number of C4: "+numberOfC4);
    System.out.println("Number of C5: "+numberOfC5+"\n");
        
    double c1TotalPrice = numberOfC1 * c1Price;
    double c2TotalPrice = numberOfC2 * c2Price;
    double c3TotalPrice = numberOfC3 * c3Price;
    double c4TotalPrice = numberOfC4 * c4Price;
    double c5TotalPrice = numberOfC5 * c5Price;
    
    System.out.println("Total C1 Price: "+c1Price);
    System.out.println("Total C2 Price: "+c2Price);
    System.out.println("Total C3 Price: "+c3Price);
    System.out.println("Total C4 Price: "+c4Price);
    System.out.println("Total C1 Price: "+c5Price+"\n");
    
    double c1PriceToDollar = c1Price / pesoToDollar;
    double c2PriceToDollar = c2Price / pesoToDollar;
    double c3PriceToDollar = c3Price / pesoToDollar;
    double c4PriceToDollar = c4Price / pesoToDollar;
    double c5PriceToDollar = c5Price / pesoToDollar;
    
    System.out.println("Total C1 Price in Dollar: "+c1PriceToDollar);
    System.out.println("Total C2 Price in Dollar: "+c2PriceToDollar);
    System.out.println("Total C3 Price in Dollar: "+c3PriceToDollar);
    System.out.println("Total C4 Price in Dollar: "+c4PriceToDollar);
    System.out.println("Total C5 Price in Dollar: "+c5PriceToDollar+"\n");  
    
    System.out.println("Add Ons");
   
    System.out.println("Number of R1 Meal: ");
    int numberOfR1 = sc.nextInt();
    
    System.out.println("Number of R2 Meal: ");
    int numberOfR2 = sc.nextInt();
    System.out.println();
    
    System.out.println("Number of R1: "+numberOfR1);
    System.out.println("Number of R2: "+numberOfR2+"\n");
    
    double r1TotalPrice = numberOfR1 * r1Price;
    double r2TotalPrice = numberOfR2 * r2Price;
    
    System.out.println("Total R1 Price: "+r1Price);
    System.out.println("Total R2 Price: "+r2Price+"\n");
    
    double r1PriceToDollar = r1Price / pesoToDollar;
    double r2PriceToDollar = r2Price / pesoToDollar;
      

    }
 
}

   
   
  
  

