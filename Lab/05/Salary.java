import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ur hours worked : ");
        double hr = sc.nextDouble();
        double ot=12.0;
        if (hr<=40){
            double rec=hr*8;
            System.out.println("You can get : "+rec);
        }else{
            double rec =(40*8)+320;
            double othr = hr - 40;
            double otp = othr*ot;
            rec += otp;
            System.out.print("You can get : "+rec);
        }

    }
}
