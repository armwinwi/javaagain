import java.util.Scanner;
public class Withdraw{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How much do u want to withdraw? :");
        int money=sc.nextInt();

        if (money>=1000){
            System.out.println("U get 1000 bath "+(money/1000)+" ea");
            money%=1000;
        }
        if (money>=500){
            System.out.println("U get 500 bath "+(money/500)+" ea");
            money%=500;
        }
        if (money >=100){
            System.out.println("U get 100 bath "+(money/100)+" ea");
            money%=100;
        }
        if (money >=50){
            System.out.println("U get 50 bath "+(money/50)+" ea" );
            money%=50;
        }
        if (money >= 20){
            System.out.println("U get 20 bath "+ (money/20)+" ea");
            money%=20;
        }
        if (money >= 10){
            System.out.println("U get 10 bath "+ (money/10)+" ea");
            money%=10;
        }
        if (money >= 5){
            System.out.println("U get 5 bath "+ (money/5) + " ea");
            money%=5;
        }
        if (money >= 1){
            System.out.println("U get 1 bath "+ (money/1) +" ea");
        }

    }

}