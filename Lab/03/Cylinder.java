import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,l;
        double ar,p = 3.1428 ,vol;
        System.out.print("Enter Radius : ");
        r = sc.nextInt();
        System.out.print("Enter Length : ");
        l = sc.nextInt();
        ar = r * r * p;
        vol = ar * l;
        System.out.print("Your Volume of Cylinder is "+vol);
    }
}
