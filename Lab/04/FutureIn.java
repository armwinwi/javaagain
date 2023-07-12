import java.util.Scanner;
public class FutureIn {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter ivestment amount : ");
    int inv = sc.nextInt();

    System.out.print("Enter annual interest rate : ");
    double inrate = sc.nextDouble();

    System.out.print("Enter number of year : ");
    int numy = sc.nextInt();
    inrate /= 100;
    inrate += 1;
    double pow =Math.pow(inrate,numy);
    
    double future = inv * pow;
    System.out.println(future);
    }
    
}
