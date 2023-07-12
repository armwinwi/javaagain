import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your name : ");
        String name = sc.nextLine();
        
        System.out.print("Enter Hours worked in a week : ");
        int hr = sc.nextInt();
        
        System.out.print("Enter Hour pay rate : ");
        double pr = sc.nextDouble();    

        double gp = hr * pr;

        double fede = gp * 0.2;

        double state = gp * 0.09;
        double ad = fede+state;

        double tt = gp - ad;
        
        System.out.println("Employee's name : "+name);
        System.out.println("Hours work : "+hr);
        System.out.println("Pay rate : "+pr);
        System.out.println("Gross pay : $"+gp);
        System.out.println("Deductions :");
        System.out.println("    "+"Federal withholding (20.0%) : "+fede);
        System.out.println("    "+"State withholding (9.0%) : "+state);
        System.out.println("    "+"Total Deducction : $"+ad);
        System.out.println("Net pay : $"+tt);


    }
    
}
