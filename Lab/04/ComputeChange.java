import java.util.Scanner;
public class ComputeChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an amount : ");
        int amount = sc.nextInt();

        int remain = amount ;

        int numusd = remain / 100;
        remain %= 100;


        System.out.println("Your amount is " + amount + " consists of");
        System.out.println("    "+ numusd + " dollars");
        System.out.println("    "+ remain + " cents");
    }
}