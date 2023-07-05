import java.util.Scanner;
public class ConvertMoney {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System. in);
        double usd;
        double thb ;
        System.out.print("Enter Usd : ");
        usd =sc.nextDouble();
        thb = usd * 31.8254 ;
        System.out.print("Your Thb is "+thb);
    }
}
